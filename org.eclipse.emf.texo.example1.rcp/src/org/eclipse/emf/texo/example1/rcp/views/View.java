package org.eclipse.emf.texo.example1.rcp.views;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.texo.example1.rcp.binding.BindingFactory;
import org.eclipse.emf.texo.example1.rcp.controller.Controller;
import org.eclipse.emf.texo.example1.rcp.music.Album;
import org.eclipse.emf.texo.example1.rcp.music.Artist;
import org.eclipse.emf.texo.example1.rcp.music.Country;
import org.eclipse.emf.texo.example1.rcp.music.Genre;
import org.eclipse.emf.texo.example1.rcp.music.MusicPackage;
import org.eclipse.emf.texo.example1.rcp.music.Rating;
import org.eclipse.emf.texo.example1.rcp.music.Song;
import org.eclipse.emf.texo.example1.rcp.util.Utils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;

public class View extends ViewPart {
	public static final String ID = "org.eclipse.emf.texo.example1.rcp.views.view";
	private static final SimpleDateFormat sdf = new SimpleDateFormat(
			"MMMMM yyyy");
	protected static final boolean DEBUG = false;

	private EContentAdapter adapter;

	private BindingFactory bf = BindingFactory.getInstance();
	private Label lblFirstname;
	private Label lblLastname;
	private Label lblBirthdate;
	private Label lblLivingAt;
	private Label lblAlbumName;
	private Label lblCountryCode;
	private Label lblCountryName;
	private List songList;
	private Label lblRatedHigh;
	private Label lblRatedLow;
	private Label lblGenres;
	private Label lblRatedCount;

	public View() {
	}

	public void setAlbumDetails(Album a) {
		lblAlbumName.setText(String.format("%s (%s)", a.getName(),
				sdf.format(a.getReleaseDate())));
	}

	public void setArtistFirstName(Artist a) {
		lblFirstname.setText(a.getFirstName());
	}

	public void setArtistLastName(Artist a) {
		lblLastname.setText(a.getLastName());
	}

	public void setArtistBirthday(Artist a) {
		lblBirthdate.setText(DateFormat.getDateInstance(DateFormat.LONG)
				.format(a.getBirthDate()));
	}

	public void setCountryCode(Country c) {
		lblCountryCode.setImage(Utils.getImage(Utils.getCountryCodeFlag(c
				.getCode())));
	}

	public void setCountryName(Country c) {
		lblCountryName.setText(c.getName());
	}

	public void setGenres(EList<Genre> genres) {
		if (genres != null) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < genres.size(); i++) {
				sb.append(genres.get(i).getName());
				if (i < genres.size() - 1) {
					sb.append(", ");
				}
			}
			lblGenres.setText(sb.toString());
		}
	}

	public void setRatings(EList<Rating> ratings) {
		if (ratings != null) {
			int highCount = 0;
			for (int i = 0; i < ratings.size(); i++) {
				if (ratings.get(i).equals(Rating.HIGH)) {
					highCount++;
				}
			}
			lblRatedHigh.setImage(Utils.getImage(Utils.getRating(Rating.HIGH)));
			lblRatedCount.setText(String.format("%d Vs %s", highCount,
					ratings.size() - highCount));
			lblRatedLow.setImage(Utils.getImage(Utils.getRating(Rating.LOW)));
		}
	}

	public void setSongs(EList<Song> songs) {
		if (songs != null) {
			String[] titles = new String[songs.size()];

			songList.removeAll();
			for (int i = 0; i < songs.size(); i++) {
				Song song = songs.get(i);
				String trackNumber = String.format("%d", song.getTrack());
				if (trackNumber.length() < 2) {
					trackNumber = "0" + trackNumber;
				}
				titles[i] = String.format("%s - %s", trackNumber,
						song.getName());
			}
			Arrays.sort(titles);
			songList.setItems(titles);
		}
	}

	@Override
	public void createPartControl(Composite parent) {
		adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				if (DEBUG)
					Utils.print("View", notification);
				if (notification.getNotifier() instanceof Resource) {
					switch (notification.getFeatureID(Resource.class)) {
					case Resource.RESOURCE__CONTENTS:
						if (notification.getNewValue() instanceof Album) {
							Album newAlbum = (Album) notification.getNewValue();
							if (newAlbum == null) {
								return;
							}

							// complete update
							setAlbumDetails(newAlbum);
							setArtistFirstName(newAlbum.getArtist());
							setArtistLastName(newAlbum.getArtist());
							setArtistBirthday(newAlbum.getArtist());
							setCountryCode(newAlbum.getArtist().getCountry());
							setCountryName(newAlbum.getArtist().getCountry());
							setGenres(newAlbum.getGenres());
							setRatings(newAlbum.getRatings());
							setSongs(newAlbum.getSongs());
						}
						break;

					default:
						break;
					}
				}

				if (notification.getNotifier() instanceof Album) {
					Album a = (Album) notification.getNotifier();
					// updateAdapter(a); // create new adapter
					switch (notification.getFeatureID(Album.class)) {
					case MusicPackage.ALBUM__NAME:
						setAlbumDetails(a);
						break;
					case MusicPackage.ALBUM__RELEASE_DATE:
						setAlbumDetails(a);
						break;

					// case MusicPackage.ALBUM__ARTIST:
					// this case is handled by own FEATURE see next switch
					// break;

					case MusicPackage.ALBUM__GENRES:
						setGenres(a.getGenres());
						break;

					case MusicPackage.ALBUM__RATINGS:
						setRatings(a.getRatings());
						break;

					case MusicPackage.ALBUM__SONGS:
						setSongs(a.getSongs());
						break;

					default:
						break;
					}
					return;
				}

				if (notification.getNotifier() instanceof Artist) {
					Artist a = (Artist) notification.getNotifier();
					switch (notification.getFeatureID(Artist.class)) {
					case MusicPackage.ARTIST__FIRST_NAME:
						setArtistFirstName(a);
						break;
					case MusicPackage.ARTIST__LAST_NAME:
						setArtistLastName(a);
						break;
					case MusicPackage.ARTIST__BIRTH_DATE:
						setArtistBirthday(a);
						break;
					}
				}

				if (notification.getNotifier() instanceof Country) {
					Country c = (Country) notification.getNotifier();
					switch (notification.getFeatureID(Country.class)) {
					case MusicPackage.COUNTRY__CODE:
						setCountryCode(c);
						break;
					case MusicPackage.COUNTRY__NAME:
						setCountryName(c);
						break;
					}
				}
			}
		};
		// register the eAdapter
		Controller.add(adapter);
		Controller.addSelectedAlbumAdapter(adapter);

		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 0;
		gridLayout.horizontalSpacing = 0;
		gridLayout.marginHeight = 0;
		gridLayout.verticalSpacing = 0;
		parent.setLayout(gridLayout);
		{ // GROUP ARTIST
			Group grpAboutTheArtist = new Group(parent, SWT.NONE);
			grpAboutTheArtist.setLayout(new GridLayout(2, false));
			grpAboutTheArtist.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 1, 1));
			grpAboutTheArtist.setText("about the Artist");

			lblFirstname = new Label(grpAboutTheArtist, SWT.RIGHT);
			lblFirstname.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1));
			lblFirstname.setText("<first name of Artist>");

			lblLastname = new Label(grpAboutTheArtist, SWT.NONE);
			lblLastname.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1));
			lblLastname.setText("<last name of artist>");

			Label lblWasBorn = new Label(grpAboutTheArtist, SWT.RIGHT);
			lblWasBorn.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1));
			lblWasBorn.setText("was born");

			lblBirthdate = new Label(grpAboutTheArtist, SWT.NONE);
			lblBirthdate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1));
			lblBirthdate.setText("<birthdate of artist>");

			lblLivingAt = new Label(grpAboutTheArtist, SWT.CENTER);
			lblLivingAt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 2, 1));
			lblLivingAt.setText("living at");

			lblCountryCode = new Label(grpAboutTheArtist, SWT.NONE);
			lblCountryCode.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					false, false, 1, 1));
			lblCountryCode.setAlignment(SWT.RIGHT);
			lblCountryCode.setText("<country code>");

			lblCountryName = new Label(grpAboutTheArtist, SWT.NONE);
			lblCountryName.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true,
					true, 1, 1));
			lblCountryName.setText("<country name>");
		}
		{ // GROUP ALBUM
			Group grpAboutTheAlbum = new Group(parent, SWT.NONE);
			grpAboutTheAlbum.setLayout(new GridLayout(3, false));
			grpAboutTheAlbum.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, true, 1, 1));
			grpAboutTheAlbum.setText("about the album");

			lblAlbumName = new Label(grpAboutTheAlbum, SWT.CENTER);
			lblAlbumName.setFont(SWTResourceManager.getFont("Tahoma", 16,
					SWT.BOLD));
			lblAlbumName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 3, 1));
			lblAlbumName.setText("<album title>");

			lblGenres = new Label(grpAboutTheAlbum, SWT.CENTER);
			lblGenres.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 3, 1));
			lblGenres.setText("<genres>");

			lblRatedHigh = new Label(grpAboutTheAlbum, SWT.RIGHT);
			GridData gd_lblRatedHigh = new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1);
			gd_lblRatedHigh.widthHint = 32;
			gd_lblRatedHigh.heightHint = 16;
			lblRatedHigh.setLayoutData(gd_lblRatedHigh);
			lblRatedHigh.setText("rated High");

			lblRatedCount = new Label(grpAboutTheAlbum, SWT.CENTER);
			GridData gd_lblRatedCount = new GridData(SWT.LEFT, SWT.CENTER,
					false, false, 1, 1);
			gd_lblRatedCount.widthHint = 50;
			lblRatedCount.setLayoutData(gd_lblRatedCount);
			lblRatedCount.setText("<ratings>");

			lblRatedLow = new Label(grpAboutTheAlbum, SWT.NONE);
			GridData gd_lblRatedLow = new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1);
			gd_lblRatedLow.heightHint = 16;
			lblRatedLow.setLayoutData(gd_lblRatedLow);
			lblRatedLow.setText("rated Low");

			songList = new List(grpAboutTheAlbum, SWT.BORDER);
			songList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
					3, 1));
			// COUNTRY NAME -->
		}
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}

	public void dispose() {
		Controller.remove(adapter);
		Controller.removeSelectedAlbumAdapter(adapter);
		bf.dispose(getClass());
	}
}