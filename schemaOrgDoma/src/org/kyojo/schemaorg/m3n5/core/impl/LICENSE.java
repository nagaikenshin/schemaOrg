package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.bib.Clazz.Atlas;
import org.kyojo.schemaorg.m3n5.bib.Clazz.Audiobook;
import org.kyojo.schemaorg.m3n5.bib.Clazz.Chapter;
import org.kyojo.schemaorg.m3n5.bib.Clazz.Collection;
import org.kyojo.schemaorg.m3n5.bib.Clazz.ComicCoverArt;
import org.kyojo.schemaorg.m3n5.bib.Clazz.ComicIssue;
import org.kyojo.schemaorg.m3n5.bib.Clazz.ComicSeries;
import org.kyojo.schemaorg.m3n5.bib.Clazz.ComicStory;
import org.kyojo.schemaorg.m3n5.bib.Clazz.CoverArt;
import org.kyojo.schemaorg.m3n5.bib.Clazz.Newspaper;
import org.kyojo.schemaorg.m3n5.bib.Clazz.Thesis;
import org.kyojo.schemaorg.m3n5.core.Clazz.APIReference;
import org.kyojo.schemaorg.m3n5.core.Clazz.AboutPage;
import org.kyojo.schemaorg.m3n5.core.Clazz.Answer;
import org.kyojo.schemaorg.m3n5.core.Clazz.Article;
import org.kyojo.schemaorg.m3n5.core.Clazz.AudioObject;
import org.kyojo.schemaorg.m3n5.core.Clazz.Barcode;
import org.kyojo.schemaorg.m3n5.core.Clazz.Blog;
import org.kyojo.schemaorg.m3n5.core.Clazz.BlogPosting;
import org.kyojo.schemaorg.m3n5.core.Clazz.Book;
import org.kyojo.schemaorg.m3n5.core.Clazz.BookSeries;
import org.kyojo.schemaorg.m3n5.core.Clazz.CheckoutPage;
import org.kyojo.schemaorg.m3n5.core.Clazz.ClaimReview;
import org.kyojo.schemaorg.m3n5.core.Clazz.Clip;
import org.kyojo.schemaorg.m3n5.core.Clazz.CollectionPage;
import org.kyojo.schemaorg.m3n5.core.Clazz.Comment;
import org.kyojo.schemaorg.m3n5.core.Clazz.ContactPage;
import org.kyojo.schemaorg.m3n5.core.Clazz.Conversation;
import org.kyojo.schemaorg.m3n5.core.Clazz.Course;
import org.kyojo.schemaorg.m3n5.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n5.core.Clazz.CreativeWorkSeason;
import org.kyojo.schemaorg.m3n5.core.Clazz.CreativeWorkSeries;
import org.kyojo.schemaorg.m3n5.core.Clazz.DataCatalog;
import org.kyojo.schemaorg.m3n5.core.Clazz.DataDownload;
import org.kyojo.schemaorg.m3n5.core.Clazz.DataFeed;
import org.kyojo.schemaorg.m3n5.core.Clazz.Dataset;
import org.kyojo.schemaorg.m3n5.core.Clazz.DigitalDocument;
import org.kyojo.schemaorg.m3n5.core.Clazz.DiscussionForumPosting;
import org.kyojo.schemaorg.m3n5.core.Clazz.EmailMessage;
import org.kyojo.schemaorg.m3n5.core.Clazz.Episode;
import org.kyojo.schemaorg.m3n5.core.Clazz.FAQPage;
import org.kyojo.schemaorg.m3n5.core.Clazz.Game;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowTo;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToDirection;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToSection;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToStep;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToTip;
import org.kyojo.schemaorg.m3n5.core.Clazz.ImageGallery;
import org.kyojo.schemaorg.m3n5.core.Clazz.ImageObject;
import org.kyojo.schemaorg.m3n5.core.Clazz.ItemPage;
import org.kyojo.schemaorg.m3n5.core.Clazz.LiveBlogPosting;
import org.kyojo.schemaorg.m3n5.core.Clazz.Map;
import org.kyojo.schemaorg.m3n5.core.Clazz.MediaObject;
import org.kyojo.schemaorg.m3n5.core.Clazz.Menu;
import org.kyojo.schemaorg.m3n5.core.Clazz.MenuSection;
import org.kyojo.schemaorg.m3n5.core.Clazz.Message;
import org.kyojo.schemaorg.m3n5.core.Clazz.MobileApplication;
import org.kyojo.schemaorg.m3n5.core.Clazz.Movie;
import org.kyojo.schemaorg.m3n5.core.Clazz.MovieClip;
import org.kyojo.schemaorg.m3n5.core.Clazz.MovieSeries;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicAlbum;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicComposition;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicPlaylist;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicRecording;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicRelease;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicVideoObject;
import org.kyojo.schemaorg.m3n5.core.Clazz.NewsArticle;
import org.kyojo.schemaorg.m3n5.core.Clazz.NoteDigitalDocument;
import org.kyojo.schemaorg.m3n5.core.Clazz.Painting;
import org.kyojo.schemaorg.m3n5.core.Clazz.Periodical;
import org.kyojo.schemaorg.m3n5.core.Clazz.Photograph;
import org.kyojo.schemaorg.m3n5.core.Clazz.PresentationDigitalDocument;
import org.kyojo.schemaorg.m3n5.core.Clazz.ProfilePage;
import org.kyojo.schemaorg.m3n5.core.Clazz.PublicationIssue;
import org.kyojo.schemaorg.m3n5.core.Clazz.PublicationVolume;
import org.kyojo.schemaorg.m3n5.core.Clazz.QAPage;
import org.kyojo.schemaorg.m3n5.core.Clazz.Question;
import org.kyojo.schemaorg.m3n5.core.Clazz.RadioClip;
import org.kyojo.schemaorg.m3n5.core.Clazz.RadioEpisode;
import org.kyojo.schemaorg.m3n5.core.Clazz.RadioSeason;
import org.kyojo.schemaorg.m3n5.core.Clazz.RadioSeries;
import org.kyojo.schemaorg.m3n5.core.Clazz.Recipe;
import org.kyojo.schemaorg.m3n5.core.Clazz.Report;
import org.kyojo.schemaorg.m3n5.core.Clazz.Review;
import org.kyojo.schemaorg.m3n5.core.Clazz.ScholarlyArticle;
import org.kyojo.schemaorg.m3n5.core.Clazz.Sculpture;
import org.kyojo.schemaorg.m3n5.core.Clazz.SearchResultsPage;
import org.kyojo.schemaorg.m3n5.core.Clazz.SiteNavigationElement;
import org.kyojo.schemaorg.m3n5.core.Clazz.SocialMediaPosting;
import org.kyojo.schemaorg.m3n5.core.Clazz.SoftwareApplication;
import org.kyojo.schemaorg.m3n5.core.Clazz.SoftwareSourceCode;
import org.kyojo.schemaorg.m3n5.core.Clazz.SpreadsheetDigitalDocument;
import org.kyojo.schemaorg.m3n5.core.Clazz.TVClip;
import org.kyojo.schemaorg.m3n5.core.Clazz.TVEpisode;
import org.kyojo.schemaorg.m3n5.core.Clazz.TVSeason;
import org.kyojo.schemaorg.m3n5.core.Clazz.TVSeries;
import org.kyojo.schemaorg.m3n5.core.Clazz.Table;
import org.kyojo.schemaorg.m3n5.core.Clazz.TechArticle;
import org.kyojo.schemaorg.m3n5.core.Clazz.TextDigitalDocument;
import org.kyojo.schemaorg.m3n5.core.Clazz.URL;
import org.kyojo.schemaorg.m3n5.core.Clazz.VideoGallery;
import org.kyojo.schemaorg.m3n5.core.Clazz.VideoGame;
import org.kyojo.schemaorg.m3n5.core.Clazz.VideoGameClip;
import org.kyojo.schemaorg.m3n5.core.Clazz.VideoGameSeries;
import org.kyojo.schemaorg.m3n5.core.Clazz.VideoObject;
import org.kyojo.schemaorg.m3n5.core.Clazz.VisualArtwork;
import org.kyojo.schemaorg.m3n5.core.Clazz.WPAdBlock;
import org.kyojo.schemaorg.m3n5.core.Clazz.WPFooter;
import org.kyojo.schemaorg.m3n5.core.Clazz.WPHeader;
import org.kyojo.schemaorg.m3n5.core.Clazz.WPSideBar;
import org.kyojo.schemaorg.m3n5.core.Clazz.WebApplication;
import org.kyojo.schemaorg.m3n5.core.Clazz.WebPage;
import org.kyojo.schemaorg.m3n5.core.Clazz.WebPageElement;
import org.kyojo.schemaorg.m3n5.core.Clazz.WebSite;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Diet;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.ExercisePlan;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalScholarlyArticle;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalWebPage;
import org.kyojo.schemaorg.m3n5.pending.Clazz.AdvertiserContentArticle;
import org.kyojo.schemaorg.m3n5.pending.Clazz.AnalysisNewsArticle;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ArchiveComponent;
import org.kyojo.schemaorg.m3n5.pending.Clazz.AskPublicNewsArticle;
import org.kyojo.schemaorg.m3n5.pending.Clazz.BackgroundNewsArticle;
import org.kyojo.schemaorg.m3n5.pending.Clazz.CategoryCodeSet;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Claim;
import org.kyojo.schemaorg.m3n5.pending.Clazz.CompleteDataFeed;
import org.kyojo.schemaorg.m3n5.pending.Clazz.CorrectionComment;
import org.kyojo.schemaorg.m3n5.pending.Clazz.CriticReview;
import org.kyojo.schemaorg.m3n5.pending.Clazz.DefinedTermSet;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Drawing;
import org.kyojo.schemaorg.m3n5.pending.Clazz.EducationalOccupationalCredential;
import org.kyojo.schemaorg.m3n5.pending.Clazz.EmployerReview;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Legislation;
import org.kyojo.schemaorg.m3n5.pending.Clazz.LegislationObject;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Manuscript;
import org.kyojo.schemaorg.m3n5.pending.Clazz.OpinionNewsArticle;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Play;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Poster;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Quotation;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ReportageNewsArticle;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ReviewNewsArticle;
import org.kyojo.schemaorg.m3n5.pending.Clazz.SatiricalArticle;
import org.kyojo.schemaorg.m3n5.pending.Clazz.SheetMusic;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ShortStory;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ThreeDimensionalModel;
import org.kyojo.schemaorg.m3n5.pending.Clazz.UserReview;

import org.seasar.doma.Transient;

public class LICENSE implements Container.License {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<APIReference> apiReferenceList;
	@Transient
	public List<AboutPage> aboutPageList;
	@Transient
	public List<AdvertiserContentArticle> advertiserContentArticleList;
	@Transient
	public List<AnalysisNewsArticle> analysisNewsArticleList;
	@Transient
	public List<Answer> answerList;
	@Transient
	public List<ArchiveComponent> archiveComponentList;
	@Transient
	public List<Article> articleList;
	@Transient
	public List<AskPublicNewsArticle> askPublicNewsArticleList;
	@Transient
	public List<Atlas> atlasList;
	@Transient
	public List<AudioObject> audioObjectList;
	@Transient
	public List<Audiobook> audiobookList;
	@Transient
	public List<BackgroundNewsArticle> backgroundNewsArticleList;
	@Transient
	public List<Barcode> barcodeList;
	@Transient
	public List<Blog> blogList;
	@Transient
	public List<BlogPosting> blogPostingList;
	@Transient
	public List<Book> bookList;
	@Transient
	public List<BookSeries> bookSeriesList;
	@Transient
	public List<CategoryCodeSet> categoryCodeSetList;
	@Transient
	public List<Chapter> chapterList;
	@Transient
	public List<CheckoutPage> checkoutPageList;
	@Transient
	public List<Claim> claimList;
	@Transient
	public List<ClaimReview> claimReviewList;
	@Transient
	public List<Clip> clipList;
	@Transient
	public List<Collection> collectionList;
	@Transient
	public List<CollectionPage> collectionPageList;
	@Transient
	public List<ComicCoverArt> comicCoverArtList;
	@Transient
	public List<ComicIssue> comicIssueList;
	@Transient
	public List<ComicSeries> comicSeriesList;
	@Transient
	public List<ComicStory> comicStoryList;
	@Transient
	public List<Comment> commentList;
	@Transient
	public List<CompleteDataFeed> completeDataFeedList;
	@Transient
	public List<ContactPage> contactPageList;
	@Transient
	public List<Conversation> conversationList;
	@Transient
	public List<CorrectionComment> correctionCommentList;
	@Transient
	public List<Course> courseList;
	@Transient
	public List<CoverArt> coverArtList;
	@Transient
	public List<CreativeWork> creativeWorkList;
	@Transient
	public List<CreativeWorkSeason> creativeWorkSeasonList;
	@Transient
	public List<CreativeWorkSeries> creativeWorkSeriesList;
	@Transient
	public List<CriticReview> criticReviewList;
	@Transient
	public List<DataCatalog> dataCatalogList;
	@Transient
	public List<DataDownload> dataDownloadList;
	@Transient
	public List<DataFeed> dataFeedList;
	@Transient
	public List<Dataset> datasetList;
	@Transient
	public List<DefinedTermSet> definedTermSetList;
	@Transient
	public List<Diet> dietList;
	@Transient
	public List<DigitalDocument> digitalDocumentList;
	@Transient
	public List<DiscussionForumPosting> discussionForumPostingList;
	@Transient
	public List<Drawing> drawingList;
	@Transient
	public List<EducationalOccupationalCredential> educationalOccupationalCredentialList;
	@Transient
	public List<EmailMessage> emailMessageList;
	@Transient
	public List<EmployerReview> employerReviewList;
	@Transient
	public List<Episode> episodeList;
	@Transient
	public List<ExercisePlan> exercisePlanList;
	@Transient
	public List<FAQPage> faqPageList;
	@Transient
	public List<Game> gameList;
	@Transient
	public List<HowTo> howToList;
	@Transient
	public List<HowToDirection> howToDirectionList;
	@Transient
	public List<HowToSection> howToSectionList;
	@Transient
	public List<HowToStep> howToStepList;
	@Transient
	public List<HowToTip> howToTipList;
	@Transient
	public List<ImageGallery> imageGalleryList;
	@Transient
	public List<ImageObject> imageObjectList;
	@Transient
	public List<ItemPage> itemPageList;
	@Transient
	public List<Legislation> legislationList;
	@Transient
	public List<LegislationObject> legislationObjectList;
	@Transient
	public List<LiveBlogPosting> liveBlogPostingList;
	@Transient
	public List<Manuscript> manuscriptList;
	@Transient
	public List<Map> mapList;
	@Transient
	public List<MediaObject> mediaObjectList;
	@Transient
	public List<MedicalScholarlyArticle> medicalScholarlyArticleList;
	@Transient
	public List<MedicalWebPage> medicalWebPageList;
	@Transient
	public List<Menu> menuList;
	@Transient
	public List<MenuSection> menuSectionList;
	@Transient
	public List<Message> messageList;
	@Transient
	public List<MobileApplication> mobileApplicationList;
	@Transient
	public List<Movie> movieList;
	@Transient
	public List<MovieClip> movieClipList;
	@Transient
	public List<MovieSeries> movieSeriesList;
	@Transient
	public List<MusicAlbum> musicAlbumList;
	@Transient
	public List<MusicComposition> musicCompositionList;
	@Transient
	public List<MusicPlaylist> musicPlaylistList;
	@Transient
	public List<MusicRecording> musicRecordingList;
	@Transient
	public List<MusicRelease> musicReleaseList;
	@Transient
	public List<MusicVideoObject> musicVideoObjectList;
	@Transient
	public List<NewsArticle> newsArticleList;
	@Transient
	public List<Newspaper> newspaperList;
	@Transient
	public List<NoteDigitalDocument> noteDigitalDocumentList;
	@Transient
	public List<OpinionNewsArticle> opinionNewsArticleList;
	@Transient
	public List<Painting> paintingList;
	@Transient
	public List<Periodical> periodicalList;
	@Transient
	public List<Photograph> photographList;
	@Transient
	public List<Play> playList;
	@Transient
	public List<Poster> posterList;
	@Transient
	public List<PresentationDigitalDocument> presentationDigitalDocumentList;
	@Transient
	public List<ProfilePage> profilePageList;
	@Transient
	public List<PublicationIssue> publicationIssueList;
	@Transient
	public List<PublicationVolume> publicationVolumeList;
	@Transient
	public List<QAPage> qaPageList;
	@Transient
	public List<Question> questionList;
	@Transient
	public List<Quotation> quotationList;
	@Transient
	public List<RadioClip> radioClipList;
	@Transient
	public List<RadioEpisode> radioEpisodeList;
	@Transient
	public List<RadioSeason> radioSeasonList;
	@Transient
	public List<RadioSeries> radioSeriesList;
	@Transient
	public List<Recipe> recipeList;
	@Transient
	public List<Report> reportList;
	@Transient
	public List<ReportageNewsArticle> reportageNewsArticleList;
	@Transient
	public List<Review> reviewList;
	@Transient
	public List<ReviewNewsArticle> reviewNewsArticleList;
	@Transient
	public List<SatiricalArticle> satiricalArticleList;
	@Transient
	public List<ScholarlyArticle> scholarlyArticleList;
	@Transient
	public List<Sculpture> sculptureList;
	@Transient
	public List<SearchResultsPage> searchResultsPageList;
	@Transient
	public List<SheetMusic> sheetMusicList;
	@Transient
	public List<ShortStory> shortStoryList;
	@Transient
	public List<SiteNavigationElement> siteNavigationElementList;
	@Transient
	public List<SocialMediaPosting> socialMediaPostingList;
	@Transient
	public List<SoftwareApplication> softwareApplicationList;
	@Transient
	public List<SoftwareSourceCode> softwareSourceCodeList;
	@Transient
	public List<SpreadsheetDigitalDocument> spreadsheetDigitalDocumentList;
	@Transient
	public List<TVClip> tvClipList;
	@Transient
	public List<TVEpisode> tvEpisodeList;
	@Transient
	public List<TVSeason> tvSeasonList;
	@Transient
	public List<TVSeries> tvSeriesList;
	@Transient
	public List<Table> tableList;
	@Transient
	public List<TechArticle> techArticleList;
	@Transient
	public List<TextDigitalDocument> textDigitalDocumentList;
	@Transient
	public List<Thesis> thesisList;
	@Transient
	public List<ThreeDimensionalModel> threeDimensionalModelList;
	@Transient
	public List<URL> urlList;
	@Transient
	public List<UserReview> userReviewList;
	@Transient
	public List<VideoGallery> videoGalleryList;
	@Transient
	public List<VideoGame> videoGameList;
	@Transient
	public List<VideoGameClip> videoGameClipList;
	@Transient
	public List<VideoGameSeries> videoGameSeriesList;
	@Transient
	public List<VideoObject> videoObjectList;
	@Transient
	public List<VisualArtwork> visualArtworkList;
	@Transient
	public List<WPAdBlock> wpAdBlockList;
	@Transient
	public List<WPFooter> wpFooterList;
	@Transient
	public List<WPHeader> wpHeaderList;
	@Transient
	public List<WPSideBar> wpSideBarList;
	@Transient
	public List<WebApplication> webApplicationList;
	@Transient
	public List<WebPage> webPageList;
	@Transient
	public List<WebPageElement> webPageElementList;
	@Transient
	public List<WebSite> webSiteList;

	public LICENSE() {
	}

	public LICENSE(String string) {
		this(new org.kyojo.schemaorg.m3n5.core.impl.URL(string));
	}

	public String getString() {
		if(urlList == null || urlList.size() == 0 || urlList.get(0) == null) {
			return null;
		} else {
			return urlList.get(0).getString();
		}
	}

	public void setString(String string) {
		if(urlList == null) {
			urlList = new ArrayList<URL>();
		}
		if(urlList.size() == 0) {
			urlList.add(new org.kyojo.schemaorg.m3n5.core.impl.URL(string));
		} else {
			urlList.set(0, new org.kyojo.schemaorg.m3n5.core.impl.URL(string));
		}
	}

	public LICENSE(APIReference apiReference) {
		apiReferenceList = new ArrayList<APIReference>();
		apiReferenceList.add(apiReference);
	}

	@Override
	public APIReference getAPIReference() {
		if(apiReferenceList != null && apiReferenceList.size() > 0) {
			return apiReferenceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAPIReference(APIReference apiReference) {
		if(apiReferenceList == null) {
			apiReferenceList = new ArrayList<>();
		}
		if(apiReferenceList.size() == 0) {
			apiReferenceList.add(apiReference);
		} else {
			apiReferenceList.set(0, apiReference);
		}
	}

	@Override
	public List<APIReference> getAPIReferenceList() {
		return apiReferenceList;
	}

	@Override
	public void setAPIReferenceList(List<APIReference> apiReferenceList) {
		this.apiReferenceList = apiReferenceList;
	}

	@Override
	public boolean hasAPIReference() {
		return apiReferenceList != null && apiReferenceList.size() > 0 && apiReferenceList.get(0) != null;
	}

	public LICENSE(AboutPage aboutPage) {
		aboutPageList = new ArrayList<AboutPage>();
		aboutPageList.add(aboutPage);
	}

	@Override
	public AboutPage getAboutPage() {
		if(aboutPageList != null && aboutPageList.size() > 0) {
			return aboutPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAboutPage(AboutPage aboutPage) {
		if(aboutPageList == null) {
			aboutPageList = new ArrayList<>();
		}
		if(aboutPageList.size() == 0) {
			aboutPageList.add(aboutPage);
		} else {
			aboutPageList.set(0, aboutPage);
		}
	}

	@Override
	public List<AboutPage> getAboutPageList() {
		return aboutPageList;
	}

	@Override
	public void setAboutPageList(List<AboutPage> aboutPageList) {
		this.aboutPageList = aboutPageList;
	}

	@Override
	public boolean hasAboutPage() {
		return aboutPageList != null && aboutPageList.size() > 0 && aboutPageList.get(0) != null;
	}

	public LICENSE(AdvertiserContentArticle advertiserContentArticle) {
		advertiserContentArticleList = new ArrayList<AdvertiserContentArticle>();
		advertiserContentArticleList.add(advertiserContentArticle);
	}

	@Override
	public AdvertiserContentArticle getAdvertiserContentArticle() {
		if(advertiserContentArticleList != null && advertiserContentArticleList.size() > 0) {
			return advertiserContentArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAdvertiserContentArticle(AdvertiserContentArticle advertiserContentArticle) {
		if(advertiserContentArticleList == null) {
			advertiserContentArticleList = new ArrayList<>();
		}
		if(advertiserContentArticleList.size() == 0) {
			advertiserContentArticleList.add(advertiserContentArticle);
		} else {
			advertiserContentArticleList.set(0, advertiserContentArticle);
		}
	}

	@Override
	public List<AdvertiserContentArticle> getAdvertiserContentArticleList() {
		return advertiserContentArticleList;
	}

	@Override
	public void setAdvertiserContentArticleList(List<AdvertiserContentArticle> advertiserContentArticleList) {
		this.advertiserContentArticleList = advertiserContentArticleList;
	}

	@Override
	public boolean hasAdvertiserContentArticle() {
		return advertiserContentArticleList != null && advertiserContentArticleList.size() > 0 && advertiserContentArticleList.get(0) != null;
	}

	public LICENSE(AnalysisNewsArticle analysisNewsArticle) {
		analysisNewsArticleList = new ArrayList<AnalysisNewsArticle>();
		analysisNewsArticleList.add(analysisNewsArticle);
	}

	@Override
	public AnalysisNewsArticle getAnalysisNewsArticle() {
		if(analysisNewsArticleList != null && analysisNewsArticleList.size() > 0) {
			return analysisNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnalysisNewsArticle(AnalysisNewsArticle analysisNewsArticle) {
		if(analysisNewsArticleList == null) {
			analysisNewsArticleList = new ArrayList<>();
		}
		if(analysisNewsArticleList.size() == 0) {
			analysisNewsArticleList.add(analysisNewsArticle);
		} else {
			analysisNewsArticleList.set(0, analysisNewsArticle);
		}
	}

	@Override
	public List<AnalysisNewsArticle> getAnalysisNewsArticleList() {
		return analysisNewsArticleList;
	}

	@Override
	public void setAnalysisNewsArticleList(List<AnalysisNewsArticle> analysisNewsArticleList) {
		this.analysisNewsArticleList = analysisNewsArticleList;
	}

	@Override
	public boolean hasAnalysisNewsArticle() {
		return analysisNewsArticleList != null && analysisNewsArticleList.size() > 0 && analysisNewsArticleList.get(0) != null;
	}

	public LICENSE(Answer answer) {
		answerList = new ArrayList<Answer>();
		answerList.add(answer);
	}

	@Override
	public Answer getAnswer() {
		if(answerList != null && answerList.size() > 0) {
			return answerList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnswer(Answer answer) {
		if(answerList == null) {
			answerList = new ArrayList<>();
		}
		if(answerList.size() == 0) {
			answerList.add(answer);
		} else {
			answerList.set(0, answer);
		}
	}

	@Override
	public List<Answer> getAnswerList() {
		return answerList;
	}

	@Override
	public void setAnswerList(List<Answer> answerList) {
		this.answerList = answerList;
	}

	@Override
	public boolean hasAnswer() {
		return answerList != null && answerList.size() > 0 && answerList.get(0) != null;
	}

	public LICENSE(ArchiveComponent archiveComponent) {
		archiveComponentList = new ArrayList<ArchiveComponent>();
		archiveComponentList.add(archiveComponent);
	}

	@Override
	public ArchiveComponent getArchiveComponent() {
		if(archiveComponentList != null && archiveComponentList.size() > 0) {
			return archiveComponentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setArchiveComponent(ArchiveComponent archiveComponent) {
		if(archiveComponentList == null) {
			archiveComponentList = new ArrayList<>();
		}
		if(archiveComponentList.size() == 0) {
			archiveComponentList.add(archiveComponent);
		} else {
			archiveComponentList.set(0, archiveComponent);
		}
	}

	@Override
	public List<ArchiveComponent> getArchiveComponentList() {
		return archiveComponentList;
	}

	@Override
	public void setArchiveComponentList(List<ArchiveComponent> archiveComponentList) {
		this.archiveComponentList = archiveComponentList;
	}

	@Override
	public boolean hasArchiveComponent() {
		return archiveComponentList != null && archiveComponentList.size() > 0 && archiveComponentList.get(0) != null;
	}

	public LICENSE(Article article) {
		articleList = new ArrayList<Article>();
		articleList.add(article);
	}

	@Override
	public Article getArticle() {
		if(articleList != null && articleList.size() > 0) {
			return articleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setArticle(Article article) {
		if(articleList == null) {
			articleList = new ArrayList<>();
		}
		if(articleList.size() == 0) {
			articleList.add(article);
		} else {
			articleList.set(0, article);
		}
	}

	@Override
	public List<Article> getArticleList() {
		return articleList;
	}

	@Override
	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}

	@Override
	public boolean hasArticle() {
		return articleList != null && articleList.size() > 0 && articleList.get(0) != null;
	}

	public LICENSE(AskPublicNewsArticle askPublicNewsArticle) {
		askPublicNewsArticleList = new ArrayList<AskPublicNewsArticle>();
		askPublicNewsArticleList.add(askPublicNewsArticle);
	}

	@Override
	public AskPublicNewsArticle getAskPublicNewsArticle() {
		if(askPublicNewsArticleList != null && askPublicNewsArticleList.size() > 0) {
			return askPublicNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAskPublicNewsArticle(AskPublicNewsArticle askPublicNewsArticle) {
		if(askPublicNewsArticleList == null) {
			askPublicNewsArticleList = new ArrayList<>();
		}
		if(askPublicNewsArticleList.size() == 0) {
			askPublicNewsArticleList.add(askPublicNewsArticle);
		} else {
			askPublicNewsArticleList.set(0, askPublicNewsArticle);
		}
	}

	@Override
	public List<AskPublicNewsArticle> getAskPublicNewsArticleList() {
		return askPublicNewsArticleList;
	}

	@Override
	public void setAskPublicNewsArticleList(List<AskPublicNewsArticle> askPublicNewsArticleList) {
		this.askPublicNewsArticleList = askPublicNewsArticleList;
	}

	@Override
	public boolean hasAskPublicNewsArticle() {
		return askPublicNewsArticleList != null && askPublicNewsArticleList.size() > 0 && askPublicNewsArticleList.get(0) != null;
	}

	public LICENSE(Atlas atlas) {
		atlasList = new ArrayList<Atlas>();
		atlasList.add(atlas);
	}

	@Override
	public Atlas getAtlas() {
		if(atlasList != null && atlasList.size() > 0) {
			return atlasList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAtlas(Atlas atlas) {
		if(atlasList == null) {
			atlasList = new ArrayList<>();
		}
		if(atlasList.size() == 0) {
			atlasList.add(atlas);
		} else {
			atlasList.set(0, atlas);
		}
	}

	@Override
	public List<Atlas> getAtlasList() {
		return atlasList;
	}

	@Override
	public void setAtlasList(List<Atlas> atlasList) {
		this.atlasList = atlasList;
	}

	@Override
	public boolean hasAtlas() {
		return atlasList != null && atlasList.size() > 0 && atlasList.get(0) != null;
	}

	public LICENSE(AudioObject audioObject) {
		audioObjectList = new ArrayList<AudioObject>();
		audioObjectList.add(audioObject);
	}

	@Override
	public AudioObject getAudioObject() {
		if(audioObjectList != null && audioObjectList.size() > 0) {
			return audioObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAudioObject(AudioObject audioObject) {
		if(audioObjectList == null) {
			audioObjectList = new ArrayList<>();
		}
		if(audioObjectList.size() == 0) {
			audioObjectList.add(audioObject);
		} else {
			audioObjectList.set(0, audioObject);
		}
	}

	@Override
	public List<AudioObject> getAudioObjectList() {
		return audioObjectList;
	}

	@Override
	public void setAudioObjectList(List<AudioObject> audioObjectList) {
		this.audioObjectList = audioObjectList;
	}

	@Override
	public boolean hasAudioObject() {
		return audioObjectList != null && audioObjectList.size() > 0 && audioObjectList.get(0) != null;
	}

	public LICENSE(Audiobook audiobook) {
		audiobookList = new ArrayList<Audiobook>();
		audiobookList.add(audiobook);
	}

	@Override
	public Audiobook getAudiobook() {
		if(audiobookList != null && audiobookList.size() > 0) {
			return audiobookList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAudiobook(Audiobook audiobook) {
		if(audiobookList == null) {
			audiobookList = new ArrayList<>();
		}
		if(audiobookList.size() == 0) {
			audiobookList.add(audiobook);
		} else {
			audiobookList.set(0, audiobook);
		}
	}

	@Override
	public List<Audiobook> getAudiobookList() {
		return audiobookList;
	}

	@Override
	public void setAudiobookList(List<Audiobook> audiobookList) {
		this.audiobookList = audiobookList;
	}

	@Override
	public boolean hasAudiobook() {
		return audiobookList != null && audiobookList.size() > 0 && audiobookList.get(0) != null;
	}

	public LICENSE(BackgroundNewsArticle backgroundNewsArticle) {
		backgroundNewsArticleList = new ArrayList<BackgroundNewsArticle>();
		backgroundNewsArticleList.add(backgroundNewsArticle);
	}

	@Override
	public BackgroundNewsArticle getBackgroundNewsArticle() {
		if(backgroundNewsArticleList != null && backgroundNewsArticleList.size() > 0) {
			return backgroundNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBackgroundNewsArticle(BackgroundNewsArticle backgroundNewsArticle) {
		if(backgroundNewsArticleList == null) {
			backgroundNewsArticleList = new ArrayList<>();
		}
		if(backgroundNewsArticleList.size() == 0) {
			backgroundNewsArticleList.add(backgroundNewsArticle);
		} else {
			backgroundNewsArticleList.set(0, backgroundNewsArticle);
		}
	}

	@Override
	public List<BackgroundNewsArticle> getBackgroundNewsArticleList() {
		return backgroundNewsArticleList;
	}

	@Override
	public void setBackgroundNewsArticleList(List<BackgroundNewsArticle> backgroundNewsArticleList) {
		this.backgroundNewsArticleList = backgroundNewsArticleList;
	}

	@Override
	public boolean hasBackgroundNewsArticle() {
		return backgroundNewsArticleList != null && backgroundNewsArticleList.size() > 0 && backgroundNewsArticleList.get(0) != null;
	}

	public LICENSE(Barcode barcode) {
		barcodeList = new ArrayList<Barcode>();
		barcodeList.add(barcode);
	}

	@Override
	public Barcode getBarcode() {
		if(barcodeList != null && barcodeList.size() > 0) {
			return barcodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBarcode(Barcode barcode) {
		if(barcodeList == null) {
			barcodeList = new ArrayList<>();
		}
		if(barcodeList.size() == 0) {
			barcodeList.add(barcode);
		} else {
			barcodeList.set(0, barcode);
		}
	}

	@Override
	public List<Barcode> getBarcodeList() {
		return barcodeList;
	}

	@Override
	public void setBarcodeList(List<Barcode> barcodeList) {
		this.barcodeList = barcodeList;
	}

	@Override
	public boolean hasBarcode() {
		return barcodeList != null && barcodeList.size() > 0 && barcodeList.get(0) != null;
	}

	public LICENSE(Blog blog) {
		blogList = new ArrayList<Blog>();
		blogList.add(blog);
	}

	@Override
	public Blog getBlog() {
		if(blogList != null && blogList.size() > 0) {
			return blogList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBlog(Blog blog) {
		if(blogList == null) {
			blogList = new ArrayList<>();
		}
		if(blogList.size() == 0) {
			blogList.add(blog);
		} else {
			blogList.set(0, blog);
		}
	}

	@Override
	public List<Blog> getBlogList() {
		return blogList;
	}

	@Override
	public void setBlogList(List<Blog> blogList) {
		this.blogList = blogList;
	}

	@Override
	public boolean hasBlog() {
		return blogList != null && blogList.size() > 0 && blogList.get(0) != null;
	}

	public LICENSE(BlogPosting blogPosting) {
		blogPostingList = new ArrayList<BlogPosting>();
		blogPostingList.add(blogPosting);
	}

	@Override
	public BlogPosting getBlogPosting() {
		if(blogPostingList != null && blogPostingList.size() > 0) {
			return blogPostingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBlogPosting(BlogPosting blogPosting) {
		if(blogPostingList == null) {
			blogPostingList = new ArrayList<>();
		}
		if(blogPostingList.size() == 0) {
			blogPostingList.add(blogPosting);
		} else {
			blogPostingList.set(0, blogPosting);
		}
	}

	@Override
	public List<BlogPosting> getBlogPostingList() {
		return blogPostingList;
	}

	@Override
	public void setBlogPostingList(List<BlogPosting> blogPostingList) {
		this.blogPostingList = blogPostingList;
	}

	@Override
	public boolean hasBlogPosting() {
		return blogPostingList != null && blogPostingList.size() > 0 && blogPostingList.get(0) != null;
	}

	public LICENSE(Book book) {
		bookList = new ArrayList<Book>();
		bookList.add(book);
	}

	@Override
	public Book getBook() {
		if(bookList != null && bookList.size() > 0) {
			return bookList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBook(Book book) {
		if(bookList == null) {
			bookList = new ArrayList<>();
		}
		if(bookList.size() == 0) {
			bookList.add(book);
		} else {
			bookList.set(0, book);
		}
	}

	@Override
	public List<Book> getBookList() {
		return bookList;
	}

	@Override
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public boolean hasBook() {
		return bookList != null && bookList.size() > 0 && bookList.get(0) != null;
	}

	public LICENSE(BookSeries bookSeries) {
		bookSeriesList = new ArrayList<BookSeries>();
		bookSeriesList.add(bookSeries);
	}

	@Override
	public BookSeries getBookSeries() {
		if(bookSeriesList != null && bookSeriesList.size() > 0) {
			return bookSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBookSeries(BookSeries bookSeries) {
		if(bookSeriesList == null) {
			bookSeriesList = new ArrayList<>();
		}
		if(bookSeriesList.size() == 0) {
			bookSeriesList.add(bookSeries);
		} else {
			bookSeriesList.set(0, bookSeries);
		}
	}

	@Override
	public List<BookSeries> getBookSeriesList() {
		return bookSeriesList;
	}

	@Override
	public void setBookSeriesList(List<BookSeries> bookSeriesList) {
		this.bookSeriesList = bookSeriesList;
	}

	@Override
	public boolean hasBookSeries() {
		return bookSeriesList != null && bookSeriesList.size() > 0 && bookSeriesList.get(0) != null;
	}

	public LICENSE(CategoryCodeSet categoryCodeSet) {
		categoryCodeSetList = new ArrayList<CategoryCodeSet>();
		categoryCodeSetList.add(categoryCodeSet);
	}

	@Override
	public CategoryCodeSet getCategoryCodeSet() {
		if(categoryCodeSetList != null && categoryCodeSetList.size() > 0) {
			return categoryCodeSetList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCategoryCodeSet(CategoryCodeSet categoryCodeSet) {
		if(categoryCodeSetList == null) {
			categoryCodeSetList = new ArrayList<>();
		}
		if(categoryCodeSetList.size() == 0) {
			categoryCodeSetList.add(categoryCodeSet);
		} else {
			categoryCodeSetList.set(0, categoryCodeSet);
		}
	}

	@Override
	public List<CategoryCodeSet> getCategoryCodeSetList() {
		return categoryCodeSetList;
	}

	@Override
	public void setCategoryCodeSetList(List<CategoryCodeSet> categoryCodeSetList) {
		this.categoryCodeSetList = categoryCodeSetList;
	}

	@Override
	public boolean hasCategoryCodeSet() {
		return categoryCodeSetList != null && categoryCodeSetList.size() > 0 && categoryCodeSetList.get(0) != null;
	}

	public LICENSE(Chapter chapter) {
		chapterList = new ArrayList<Chapter>();
		chapterList.add(chapter);
	}

	@Override
	public Chapter getChapter() {
		if(chapterList != null && chapterList.size() > 0) {
			return chapterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setChapter(Chapter chapter) {
		if(chapterList == null) {
			chapterList = new ArrayList<>();
		}
		if(chapterList.size() == 0) {
			chapterList.add(chapter);
		} else {
			chapterList.set(0, chapter);
		}
	}

	@Override
	public List<Chapter> getChapterList() {
		return chapterList;
	}

	@Override
	public void setChapterList(List<Chapter> chapterList) {
		this.chapterList = chapterList;
	}

	@Override
	public boolean hasChapter() {
		return chapterList != null && chapterList.size() > 0 && chapterList.get(0) != null;
	}

	public LICENSE(CheckoutPage checkoutPage) {
		checkoutPageList = new ArrayList<CheckoutPage>();
		checkoutPageList.add(checkoutPage);
	}

	@Override
	public CheckoutPage getCheckoutPage() {
		if(checkoutPageList != null && checkoutPageList.size() > 0) {
			return checkoutPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCheckoutPage(CheckoutPage checkoutPage) {
		if(checkoutPageList == null) {
			checkoutPageList = new ArrayList<>();
		}
		if(checkoutPageList.size() == 0) {
			checkoutPageList.add(checkoutPage);
		} else {
			checkoutPageList.set(0, checkoutPage);
		}
	}

	@Override
	public List<CheckoutPage> getCheckoutPageList() {
		return checkoutPageList;
	}

	@Override
	public void setCheckoutPageList(List<CheckoutPage> checkoutPageList) {
		this.checkoutPageList = checkoutPageList;
	}

	@Override
	public boolean hasCheckoutPage() {
		return checkoutPageList != null && checkoutPageList.size() > 0 && checkoutPageList.get(0) != null;
	}

	public LICENSE(Claim claim) {
		claimList = new ArrayList<Claim>();
		claimList.add(claim);
	}

	@Override
	public Claim getClaim() {
		if(claimList != null && claimList.size() > 0) {
			return claimList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setClaim(Claim claim) {
		if(claimList == null) {
			claimList = new ArrayList<>();
		}
		if(claimList.size() == 0) {
			claimList.add(claim);
		} else {
			claimList.set(0, claim);
		}
	}

	@Override
	public List<Claim> getClaimList() {
		return claimList;
	}

	@Override
	public void setClaimList(List<Claim> claimList) {
		this.claimList = claimList;
	}

	@Override
	public boolean hasClaim() {
		return claimList != null && claimList.size() > 0 && claimList.get(0) != null;
	}

	public LICENSE(ClaimReview claimReview) {
		claimReviewList = new ArrayList<ClaimReview>();
		claimReviewList.add(claimReview);
	}

	@Override
	public ClaimReview getClaimReview() {
		if(claimReviewList != null && claimReviewList.size() > 0) {
			return claimReviewList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setClaimReview(ClaimReview claimReview) {
		if(claimReviewList == null) {
			claimReviewList = new ArrayList<>();
		}
		if(claimReviewList.size() == 0) {
			claimReviewList.add(claimReview);
		} else {
			claimReviewList.set(0, claimReview);
		}
	}

	@Override
	public List<ClaimReview> getClaimReviewList() {
		return claimReviewList;
	}

	@Override
	public void setClaimReviewList(List<ClaimReview> claimReviewList) {
		this.claimReviewList = claimReviewList;
	}

	@Override
	public boolean hasClaimReview() {
		return claimReviewList != null && claimReviewList.size() > 0 && claimReviewList.get(0) != null;
	}

	public LICENSE(Clip clip) {
		clipList = new ArrayList<Clip>();
		clipList.add(clip);
	}

	@Override
	public Clip getClip() {
		if(clipList != null && clipList.size() > 0) {
			return clipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setClip(Clip clip) {
		if(clipList == null) {
			clipList = new ArrayList<>();
		}
		if(clipList.size() == 0) {
			clipList.add(clip);
		} else {
			clipList.set(0, clip);
		}
	}

	@Override
	public List<Clip> getClipList() {
		return clipList;
	}

	@Override
	public void setClipList(List<Clip> clipList) {
		this.clipList = clipList;
	}

	@Override
	public boolean hasClip() {
		return clipList != null && clipList.size() > 0 && clipList.get(0) != null;
	}

	public LICENSE(Collection collection) {
		collectionList = new ArrayList<Collection>();
		collectionList.add(collection);
	}

	@Override
	public Collection getCollection() {
		if(collectionList != null && collectionList.size() > 0) {
			return collectionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCollection(Collection collection) {
		if(collectionList == null) {
			collectionList = new ArrayList<>();
		}
		if(collectionList.size() == 0) {
			collectionList.add(collection);
		} else {
			collectionList.set(0, collection);
		}
	}

	@Override
	public List<Collection> getCollectionList() {
		return collectionList;
	}

	@Override
	public void setCollectionList(List<Collection> collectionList) {
		this.collectionList = collectionList;
	}

	@Override
	public boolean hasCollection() {
		return collectionList != null && collectionList.size() > 0 && collectionList.get(0) != null;
	}

	public LICENSE(CollectionPage collectionPage) {
		collectionPageList = new ArrayList<CollectionPage>();
		collectionPageList.add(collectionPage);
	}

	@Override
	public CollectionPage getCollectionPage() {
		if(collectionPageList != null && collectionPageList.size() > 0) {
			return collectionPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCollectionPage(CollectionPage collectionPage) {
		if(collectionPageList == null) {
			collectionPageList = new ArrayList<>();
		}
		if(collectionPageList.size() == 0) {
			collectionPageList.add(collectionPage);
		} else {
			collectionPageList.set(0, collectionPage);
		}
	}

	@Override
	public List<CollectionPage> getCollectionPageList() {
		return collectionPageList;
	}

	@Override
	public void setCollectionPageList(List<CollectionPage> collectionPageList) {
		this.collectionPageList = collectionPageList;
	}

	@Override
	public boolean hasCollectionPage() {
		return collectionPageList != null && collectionPageList.size() > 0 && collectionPageList.get(0) != null;
	}

	public LICENSE(ComicCoverArt comicCoverArt) {
		comicCoverArtList = new ArrayList<ComicCoverArt>();
		comicCoverArtList.add(comicCoverArt);
	}

	@Override
	public ComicCoverArt getComicCoverArt() {
		if(comicCoverArtList != null && comicCoverArtList.size() > 0) {
			return comicCoverArtList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComicCoverArt(ComicCoverArt comicCoverArt) {
		if(comicCoverArtList == null) {
			comicCoverArtList = new ArrayList<>();
		}
		if(comicCoverArtList.size() == 0) {
			comicCoverArtList.add(comicCoverArt);
		} else {
			comicCoverArtList.set(0, comicCoverArt);
		}
	}

	@Override
	public List<ComicCoverArt> getComicCoverArtList() {
		return comicCoverArtList;
	}

	@Override
	public void setComicCoverArtList(List<ComicCoverArt> comicCoverArtList) {
		this.comicCoverArtList = comicCoverArtList;
	}

	@Override
	public boolean hasComicCoverArt() {
		return comicCoverArtList != null && comicCoverArtList.size() > 0 && comicCoverArtList.get(0) != null;
	}

	public LICENSE(ComicIssue comicIssue) {
		comicIssueList = new ArrayList<ComicIssue>();
		comicIssueList.add(comicIssue);
	}

	@Override
	public ComicIssue getComicIssue() {
		if(comicIssueList != null && comicIssueList.size() > 0) {
			return comicIssueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComicIssue(ComicIssue comicIssue) {
		if(comicIssueList == null) {
			comicIssueList = new ArrayList<>();
		}
		if(comicIssueList.size() == 0) {
			comicIssueList.add(comicIssue);
		} else {
			comicIssueList.set(0, comicIssue);
		}
	}

	@Override
	public List<ComicIssue> getComicIssueList() {
		return comicIssueList;
	}

	@Override
	public void setComicIssueList(List<ComicIssue> comicIssueList) {
		this.comicIssueList = comicIssueList;
	}

	@Override
	public boolean hasComicIssue() {
		return comicIssueList != null && comicIssueList.size() > 0 && comicIssueList.get(0) != null;
	}

	public LICENSE(ComicSeries comicSeries) {
		comicSeriesList = new ArrayList<ComicSeries>();
		comicSeriesList.add(comicSeries);
	}

	@Override
	public ComicSeries getComicSeries() {
		if(comicSeriesList != null && comicSeriesList.size() > 0) {
			return comicSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComicSeries(ComicSeries comicSeries) {
		if(comicSeriesList == null) {
			comicSeriesList = new ArrayList<>();
		}
		if(comicSeriesList.size() == 0) {
			comicSeriesList.add(comicSeries);
		} else {
			comicSeriesList.set(0, comicSeries);
		}
	}

	@Override
	public List<ComicSeries> getComicSeriesList() {
		return comicSeriesList;
	}

	@Override
	public void setComicSeriesList(List<ComicSeries> comicSeriesList) {
		this.comicSeriesList = comicSeriesList;
	}

	@Override
	public boolean hasComicSeries() {
		return comicSeriesList != null && comicSeriesList.size() > 0 && comicSeriesList.get(0) != null;
	}

	public LICENSE(ComicStory comicStory) {
		comicStoryList = new ArrayList<ComicStory>();
		comicStoryList.add(comicStory);
	}

	@Override
	public ComicStory getComicStory() {
		if(comicStoryList != null && comicStoryList.size() > 0) {
			return comicStoryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComicStory(ComicStory comicStory) {
		if(comicStoryList == null) {
			comicStoryList = new ArrayList<>();
		}
		if(comicStoryList.size() == 0) {
			comicStoryList.add(comicStory);
		} else {
			comicStoryList.set(0, comicStory);
		}
	}

	@Override
	public List<ComicStory> getComicStoryList() {
		return comicStoryList;
	}

	@Override
	public void setComicStoryList(List<ComicStory> comicStoryList) {
		this.comicStoryList = comicStoryList;
	}

	@Override
	public boolean hasComicStory() {
		return comicStoryList != null && comicStoryList.size() > 0 && comicStoryList.get(0) != null;
	}

	public LICENSE(Comment comment) {
		commentList = new ArrayList<Comment>();
		commentList.add(comment);
	}

	@Override
	public Comment getComment() {
		if(commentList != null && commentList.size() > 0) {
			return commentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComment(Comment comment) {
		if(commentList == null) {
			commentList = new ArrayList<>();
		}
		if(commentList.size() == 0) {
			commentList.add(comment);
		} else {
			commentList.set(0, comment);
		}
	}

	@Override
	public List<Comment> getCommentList() {
		return commentList;
	}

	@Override
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	@Override
	public boolean hasComment() {
		return commentList != null && commentList.size() > 0 && commentList.get(0) != null;
	}

	public LICENSE(CompleteDataFeed completeDataFeed) {
		completeDataFeedList = new ArrayList<CompleteDataFeed>();
		completeDataFeedList.add(completeDataFeed);
	}

	@Override
	public CompleteDataFeed getCompleteDataFeed() {
		if(completeDataFeedList != null && completeDataFeedList.size() > 0) {
			return completeDataFeedList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCompleteDataFeed(CompleteDataFeed completeDataFeed) {
		if(completeDataFeedList == null) {
			completeDataFeedList = new ArrayList<>();
		}
		if(completeDataFeedList.size() == 0) {
			completeDataFeedList.add(completeDataFeed);
		} else {
			completeDataFeedList.set(0, completeDataFeed);
		}
	}

	@Override
	public List<CompleteDataFeed> getCompleteDataFeedList() {
		return completeDataFeedList;
	}

	@Override
	public void setCompleteDataFeedList(List<CompleteDataFeed> completeDataFeedList) {
		this.completeDataFeedList = completeDataFeedList;
	}

	@Override
	public boolean hasCompleteDataFeed() {
		return completeDataFeedList != null && completeDataFeedList.size() > 0 && completeDataFeedList.get(0) != null;
	}

	public LICENSE(ContactPage contactPage) {
		contactPageList = new ArrayList<ContactPage>();
		contactPageList.add(contactPage);
	}

	@Override
	public ContactPage getContactPage() {
		if(contactPageList != null && contactPageList.size() > 0) {
			return contactPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setContactPage(ContactPage contactPage) {
		if(contactPageList == null) {
			contactPageList = new ArrayList<>();
		}
		if(contactPageList.size() == 0) {
			contactPageList.add(contactPage);
		} else {
			contactPageList.set(0, contactPage);
		}
	}

	@Override
	public List<ContactPage> getContactPageList() {
		return contactPageList;
	}

	@Override
	public void setContactPageList(List<ContactPage> contactPageList) {
		this.contactPageList = contactPageList;
	}

	@Override
	public boolean hasContactPage() {
		return contactPageList != null && contactPageList.size() > 0 && contactPageList.get(0) != null;
	}

	public LICENSE(Conversation conversation) {
		conversationList = new ArrayList<Conversation>();
		conversationList.add(conversation);
	}

	@Override
	public Conversation getConversation() {
		if(conversationList != null && conversationList.size() > 0) {
			return conversationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setConversation(Conversation conversation) {
		if(conversationList == null) {
			conversationList = new ArrayList<>();
		}
		if(conversationList.size() == 0) {
			conversationList.add(conversation);
		} else {
			conversationList.set(0, conversation);
		}
	}

	@Override
	public List<Conversation> getConversationList() {
		return conversationList;
	}

	@Override
	public void setConversationList(List<Conversation> conversationList) {
		this.conversationList = conversationList;
	}

	@Override
	public boolean hasConversation() {
		return conversationList != null && conversationList.size() > 0 && conversationList.get(0) != null;
	}

	public LICENSE(CorrectionComment correctionComment) {
		correctionCommentList = new ArrayList<CorrectionComment>();
		correctionCommentList.add(correctionComment);
	}

	@Override
	public CorrectionComment getCorrectionComment() {
		if(correctionCommentList != null && correctionCommentList.size() > 0) {
			return correctionCommentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCorrectionComment(CorrectionComment correctionComment) {
		if(correctionCommentList == null) {
			correctionCommentList = new ArrayList<>();
		}
		if(correctionCommentList.size() == 0) {
			correctionCommentList.add(correctionComment);
		} else {
			correctionCommentList.set(0, correctionComment);
		}
	}

	@Override
	public List<CorrectionComment> getCorrectionCommentList() {
		return correctionCommentList;
	}

	@Override
	public void setCorrectionCommentList(List<CorrectionComment> correctionCommentList) {
		this.correctionCommentList = correctionCommentList;
	}

	@Override
	public boolean hasCorrectionComment() {
		return correctionCommentList != null && correctionCommentList.size() > 0 && correctionCommentList.get(0) != null;
	}

	public LICENSE(Course course) {
		courseList = new ArrayList<Course>();
		courseList.add(course);
	}

	@Override
	public Course getCourse() {
		if(courseList != null && courseList.size() > 0) {
			return courseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCourse(Course course) {
		if(courseList == null) {
			courseList = new ArrayList<>();
		}
		if(courseList.size() == 0) {
			courseList.add(course);
		} else {
			courseList.set(0, course);
		}
	}

	@Override
	public List<Course> getCourseList() {
		return courseList;
	}

	@Override
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	@Override
	public boolean hasCourse() {
		return courseList != null && courseList.size() > 0 && courseList.get(0) != null;
	}

	public LICENSE(CoverArt coverArt) {
		coverArtList = new ArrayList<CoverArt>();
		coverArtList.add(coverArt);
	}

	@Override
	public CoverArt getCoverArt() {
		if(coverArtList != null && coverArtList.size() > 0) {
			return coverArtList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCoverArt(CoverArt coverArt) {
		if(coverArtList == null) {
			coverArtList = new ArrayList<>();
		}
		if(coverArtList.size() == 0) {
			coverArtList.add(coverArt);
		} else {
			coverArtList.set(0, coverArt);
		}
	}

	@Override
	public List<CoverArt> getCoverArtList() {
		return coverArtList;
	}

	@Override
	public void setCoverArtList(List<CoverArt> coverArtList) {
		this.coverArtList = coverArtList;
	}

	@Override
	public boolean hasCoverArt() {
		return coverArtList != null && coverArtList.size() > 0 && coverArtList.get(0) != null;
	}

	public LICENSE(CreativeWork creativeWork) {
		creativeWorkList = new ArrayList<CreativeWork>();
		creativeWorkList.add(creativeWork);
	}

	@Override
	public CreativeWork getCreativeWork() {
		if(creativeWorkList != null && creativeWorkList.size() > 0) {
			return creativeWorkList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreativeWork(CreativeWork creativeWork) {
		if(creativeWorkList == null) {
			creativeWorkList = new ArrayList<>();
		}
		if(creativeWorkList.size() == 0) {
			creativeWorkList.add(creativeWork);
		} else {
			creativeWorkList.set(0, creativeWork);
		}
	}

	@Override
	public List<CreativeWork> getCreativeWorkList() {
		return creativeWorkList;
	}

	@Override
	public void setCreativeWorkList(List<CreativeWork> creativeWorkList) {
		this.creativeWorkList = creativeWorkList;
	}

	@Override
	public boolean hasCreativeWork() {
		return creativeWorkList != null && creativeWorkList.size() > 0 && creativeWorkList.get(0) != null;
	}

	public LICENSE(CreativeWorkSeason creativeWorkSeason) {
		creativeWorkSeasonList = new ArrayList<CreativeWorkSeason>();
		creativeWorkSeasonList.add(creativeWorkSeason);
	}

	@Override
	public CreativeWorkSeason getCreativeWorkSeason() {
		if(creativeWorkSeasonList != null && creativeWorkSeasonList.size() > 0) {
			return creativeWorkSeasonList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreativeWorkSeason(CreativeWorkSeason creativeWorkSeason) {
		if(creativeWorkSeasonList == null) {
			creativeWorkSeasonList = new ArrayList<>();
		}
		if(creativeWorkSeasonList.size() == 0) {
			creativeWorkSeasonList.add(creativeWorkSeason);
		} else {
			creativeWorkSeasonList.set(0, creativeWorkSeason);
		}
	}

	@Override
	public List<CreativeWorkSeason> getCreativeWorkSeasonList() {
		return creativeWorkSeasonList;
	}

	@Override
	public void setCreativeWorkSeasonList(List<CreativeWorkSeason> creativeWorkSeasonList) {
		this.creativeWorkSeasonList = creativeWorkSeasonList;
	}

	@Override
	public boolean hasCreativeWorkSeason() {
		return creativeWorkSeasonList != null && creativeWorkSeasonList.size() > 0 && creativeWorkSeasonList.get(0) != null;
	}

	public LICENSE(CreativeWorkSeries creativeWorkSeries) {
		creativeWorkSeriesList = new ArrayList<CreativeWorkSeries>();
		creativeWorkSeriesList.add(creativeWorkSeries);
	}

	@Override
	public CreativeWorkSeries getCreativeWorkSeries() {
		if(creativeWorkSeriesList != null && creativeWorkSeriesList.size() > 0) {
			return creativeWorkSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreativeWorkSeries(CreativeWorkSeries creativeWorkSeries) {
		if(creativeWorkSeriesList == null) {
			creativeWorkSeriesList = new ArrayList<>();
		}
		if(creativeWorkSeriesList.size() == 0) {
			creativeWorkSeriesList.add(creativeWorkSeries);
		} else {
			creativeWorkSeriesList.set(0, creativeWorkSeries);
		}
	}

	@Override
	public List<CreativeWorkSeries> getCreativeWorkSeriesList() {
		return creativeWorkSeriesList;
	}

	@Override
	public void setCreativeWorkSeriesList(List<CreativeWorkSeries> creativeWorkSeriesList) {
		this.creativeWorkSeriesList = creativeWorkSeriesList;
	}

	@Override
	public boolean hasCreativeWorkSeries() {
		return creativeWorkSeriesList != null && creativeWorkSeriesList.size() > 0 && creativeWorkSeriesList.get(0) != null;
	}

	public LICENSE(CriticReview criticReview) {
		criticReviewList = new ArrayList<CriticReview>();
		criticReviewList.add(criticReview);
	}

	@Override
	public CriticReview getCriticReview() {
		if(criticReviewList != null && criticReviewList.size() > 0) {
			return criticReviewList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCriticReview(CriticReview criticReview) {
		if(criticReviewList == null) {
			criticReviewList = new ArrayList<>();
		}
		if(criticReviewList.size() == 0) {
			criticReviewList.add(criticReview);
		} else {
			criticReviewList.set(0, criticReview);
		}
	}

	@Override
	public List<CriticReview> getCriticReviewList() {
		return criticReviewList;
	}

	@Override
	public void setCriticReviewList(List<CriticReview> criticReviewList) {
		this.criticReviewList = criticReviewList;
	}

	@Override
	public boolean hasCriticReview() {
		return criticReviewList != null && criticReviewList.size() > 0 && criticReviewList.get(0) != null;
	}

	public LICENSE(DataCatalog dataCatalog) {
		dataCatalogList = new ArrayList<DataCatalog>();
		dataCatalogList.add(dataCatalog);
	}

	@Override
	public DataCatalog getDataCatalog() {
		if(dataCatalogList != null && dataCatalogList.size() > 0) {
			return dataCatalogList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataCatalog(DataCatalog dataCatalog) {
		if(dataCatalogList == null) {
			dataCatalogList = new ArrayList<>();
		}
		if(dataCatalogList.size() == 0) {
			dataCatalogList.add(dataCatalog);
		} else {
			dataCatalogList.set(0, dataCatalog);
		}
	}

	@Override
	public List<DataCatalog> getDataCatalogList() {
		return dataCatalogList;
	}

	@Override
	public void setDataCatalogList(List<DataCatalog> dataCatalogList) {
		this.dataCatalogList = dataCatalogList;
	}

	@Override
	public boolean hasDataCatalog() {
		return dataCatalogList != null && dataCatalogList.size() > 0 && dataCatalogList.get(0) != null;
	}

	public LICENSE(DataDownload dataDownload) {
		dataDownloadList = new ArrayList<DataDownload>();
		dataDownloadList.add(dataDownload);
	}

	@Override
	public DataDownload getDataDownload() {
		if(dataDownloadList != null && dataDownloadList.size() > 0) {
			return dataDownloadList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataDownload(DataDownload dataDownload) {
		if(dataDownloadList == null) {
			dataDownloadList = new ArrayList<>();
		}
		if(dataDownloadList.size() == 0) {
			dataDownloadList.add(dataDownload);
		} else {
			dataDownloadList.set(0, dataDownload);
		}
	}

	@Override
	public List<DataDownload> getDataDownloadList() {
		return dataDownloadList;
	}

	@Override
	public void setDataDownloadList(List<DataDownload> dataDownloadList) {
		this.dataDownloadList = dataDownloadList;
	}

	@Override
	public boolean hasDataDownload() {
		return dataDownloadList != null && dataDownloadList.size() > 0 && dataDownloadList.get(0) != null;
	}

	public LICENSE(DataFeed dataFeed) {
		dataFeedList = new ArrayList<DataFeed>();
		dataFeedList.add(dataFeed);
	}

	@Override
	public DataFeed getDataFeed() {
		if(dataFeedList != null && dataFeedList.size() > 0) {
			return dataFeedList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataFeed(DataFeed dataFeed) {
		if(dataFeedList == null) {
			dataFeedList = new ArrayList<>();
		}
		if(dataFeedList.size() == 0) {
			dataFeedList.add(dataFeed);
		} else {
			dataFeedList.set(0, dataFeed);
		}
	}

	@Override
	public List<DataFeed> getDataFeedList() {
		return dataFeedList;
	}

	@Override
	public void setDataFeedList(List<DataFeed> dataFeedList) {
		this.dataFeedList = dataFeedList;
	}

	@Override
	public boolean hasDataFeed() {
		return dataFeedList != null && dataFeedList.size() > 0 && dataFeedList.get(0) != null;
	}

	public LICENSE(Dataset dataset) {
		datasetList = new ArrayList<Dataset>();
		datasetList.add(dataset);
	}

	@Override
	public Dataset getDataset() {
		if(datasetList != null && datasetList.size() > 0) {
			return datasetList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataset(Dataset dataset) {
		if(datasetList == null) {
			datasetList = new ArrayList<>();
		}
		if(datasetList.size() == 0) {
			datasetList.add(dataset);
		} else {
			datasetList.set(0, dataset);
		}
	}

	@Override
	public List<Dataset> getDatasetList() {
		return datasetList;
	}

	@Override
	public void setDatasetList(List<Dataset> datasetList) {
		this.datasetList = datasetList;
	}

	@Override
	public boolean hasDataset() {
		return datasetList != null && datasetList.size() > 0 && datasetList.get(0) != null;
	}

	public LICENSE(DefinedTermSet definedTermSet) {
		definedTermSetList = new ArrayList<DefinedTermSet>();
		definedTermSetList.add(definedTermSet);
	}

	@Override
	public DefinedTermSet getDefinedTermSet() {
		if(definedTermSetList != null && definedTermSetList.size() > 0) {
			return definedTermSetList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDefinedTermSet(DefinedTermSet definedTermSet) {
		if(definedTermSetList == null) {
			definedTermSetList = new ArrayList<>();
		}
		if(definedTermSetList.size() == 0) {
			definedTermSetList.add(definedTermSet);
		} else {
			definedTermSetList.set(0, definedTermSet);
		}
	}

	@Override
	public List<DefinedTermSet> getDefinedTermSetList() {
		return definedTermSetList;
	}

	@Override
	public void setDefinedTermSetList(List<DefinedTermSet> definedTermSetList) {
		this.definedTermSetList = definedTermSetList;
	}

	@Override
	public boolean hasDefinedTermSet() {
		return definedTermSetList != null && definedTermSetList.size() > 0 && definedTermSetList.get(0) != null;
	}

	public LICENSE(Diet diet) {
		dietList = new ArrayList<Diet>();
		dietList.add(diet);
	}

	@Override
	public Diet getDiet() {
		if(dietList != null && dietList.size() > 0) {
			return dietList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDiet(Diet diet) {
		if(dietList == null) {
			dietList = new ArrayList<>();
		}
		if(dietList.size() == 0) {
			dietList.add(diet);
		} else {
			dietList.set(0, diet);
		}
	}

	@Override
	public List<Diet> getDietList() {
		return dietList;
	}

	@Override
	public void setDietList(List<Diet> dietList) {
		this.dietList = dietList;
	}

	@Override
	public boolean hasDiet() {
		return dietList != null && dietList.size() > 0 && dietList.get(0) != null;
	}

	public LICENSE(DigitalDocument digitalDocument) {
		digitalDocumentList = new ArrayList<DigitalDocument>();
		digitalDocumentList.add(digitalDocument);
	}

	@Override
	public DigitalDocument getDigitalDocument() {
		if(digitalDocumentList != null && digitalDocumentList.size() > 0) {
			return digitalDocumentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDigitalDocument(DigitalDocument digitalDocument) {
		if(digitalDocumentList == null) {
			digitalDocumentList = new ArrayList<>();
		}
		if(digitalDocumentList.size() == 0) {
			digitalDocumentList.add(digitalDocument);
		} else {
			digitalDocumentList.set(0, digitalDocument);
		}
	}

	@Override
	public List<DigitalDocument> getDigitalDocumentList() {
		return digitalDocumentList;
	}

	@Override
	public void setDigitalDocumentList(List<DigitalDocument> digitalDocumentList) {
		this.digitalDocumentList = digitalDocumentList;
	}

	@Override
	public boolean hasDigitalDocument() {
		return digitalDocumentList != null && digitalDocumentList.size() > 0 && digitalDocumentList.get(0) != null;
	}

	public LICENSE(DiscussionForumPosting discussionForumPosting) {
		discussionForumPostingList = new ArrayList<DiscussionForumPosting>();
		discussionForumPostingList.add(discussionForumPosting);
	}

	@Override
	public DiscussionForumPosting getDiscussionForumPosting() {
		if(discussionForumPostingList != null && discussionForumPostingList.size() > 0) {
			return discussionForumPostingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDiscussionForumPosting(DiscussionForumPosting discussionForumPosting) {
		if(discussionForumPostingList == null) {
			discussionForumPostingList = new ArrayList<>();
		}
		if(discussionForumPostingList.size() == 0) {
			discussionForumPostingList.add(discussionForumPosting);
		} else {
			discussionForumPostingList.set(0, discussionForumPosting);
		}
	}

	@Override
	public List<DiscussionForumPosting> getDiscussionForumPostingList() {
		return discussionForumPostingList;
	}

	@Override
	public void setDiscussionForumPostingList(List<DiscussionForumPosting> discussionForumPostingList) {
		this.discussionForumPostingList = discussionForumPostingList;
	}

	@Override
	public boolean hasDiscussionForumPosting() {
		return discussionForumPostingList != null && discussionForumPostingList.size() > 0 && discussionForumPostingList.get(0) != null;
	}

	public LICENSE(Drawing drawing) {
		drawingList = new ArrayList<Drawing>();
		drawingList.add(drawing);
	}

	@Override
	public Drawing getDrawing() {
		if(drawingList != null && drawingList.size() > 0) {
			return drawingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrawing(Drawing drawing) {
		if(drawingList == null) {
			drawingList = new ArrayList<>();
		}
		if(drawingList.size() == 0) {
			drawingList.add(drawing);
		} else {
			drawingList.set(0, drawing);
		}
	}

	@Override
	public List<Drawing> getDrawingList() {
		return drawingList;
	}

	@Override
	public void setDrawingList(List<Drawing> drawingList) {
		this.drawingList = drawingList;
	}

	@Override
	public boolean hasDrawing() {
		return drawingList != null && drawingList.size() > 0 && drawingList.get(0) != null;
	}

	public LICENSE(EducationalOccupationalCredential educationalOccupationalCredential) {
		educationalOccupationalCredentialList = new ArrayList<EducationalOccupationalCredential>();
		educationalOccupationalCredentialList.add(educationalOccupationalCredential);
	}

	@Override
	public EducationalOccupationalCredential getEducationalOccupationalCredential() {
		if(educationalOccupationalCredentialList != null && educationalOccupationalCredentialList.size() > 0) {
			return educationalOccupationalCredentialList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEducationalOccupationalCredential(EducationalOccupationalCredential educationalOccupationalCredential) {
		if(educationalOccupationalCredentialList == null) {
			educationalOccupationalCredentialList = new ArrayList<>();
		}
		if(educationalOccupationalCredentialList.size() == 0) {
			educationalOccupationalCredentialList.add(educationalOccupationalCredential);
		} else {
			educationalOccupationalCredentialList.set(0, educationalOccupationalCredential);
		}
	}

	@Override
	public List<EducationalOccupationalCredential> getEducationalOccupationalCredentialList() {
		return educationalOccupationalCredentialList;
	}

	@Override
	public void setEducationalOccupationalCredentialList(List<EducationalOccupationalCredential> educationalOccupationalCredentialList) {
		this.educationalOccupationalCredentialList = educationalOccupationalCredentialList;
	}

	@Override
	public boolean hasEducationalOccupationalCredential() {
		return educationalOccupationalCredentialList != null && educationalOccupationalCredentialList.size() > 0 && educationalOccupationalCredentialList.get(0) != null;
	}

	public LICENSE(EmailMessage emailMessage) {
		emailMessageList = new ArrayList<EmailMessage>();
		emailMessageList.add(emailMessage);
	}

	@Override
	public EmailMessage getEmailMessage() {
		if(emailMessageList != null && emailMessageList.size() > 0) {
			return emailMessageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEmailMessage(EmailMessage emailMessage) {
		if(emailMessageList == null) {
			emailMessageList = new ArrayList<>();
		}
		if(emailMessageList.size() == 0) {
			emailMessageList.add(emailMessage);
		} else {
			emailMessageList.set(0, emailMessage);
		}
	}

	@Override
	public List<EmailMessage> getEmailMessageList() {
		return emailMessageList;
	}

	@Override
	public void setEmailMessageList(List<EmailMessage> emailMessageList) {
		this.emailMessageList = emailMessageList;
	}

	@Override
	public boolean hasEmailMessage() {
		return emailMessageList != null && emailMessageList.size() > 0 && emailMessageList.get(0) != null;
	}

	public LICENSE(EmployerReview employerReview) {
		employerReviewList = new ArrayList<EmployerReview>();
		employerReviewList.add(employerReview);
	}

	@Override
	public EmployerReview getEmployerReview() {
		if(employerReviewList != null && employerReviewList.size() > 0) {
			return employerReviewList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEmployerReview(EmployerReview employerReview) {
		if(employerReviewList == null) {
			employerReviewList = new ArrayList<>();
		}
		if(employerReviewList.size() == 0) {
			employerReviewList.add(employerReview);
		} else {
			employerReviewList.set(0, employerReview);
		}
	}

	@Override
	public List<EmployerReview> getEmployerReviewList() {
		return employerReviewList;
	}

	@Override
	public void setEmployerReviewList(List<EmployerReview> employerReviewList) {
		this.employerReviewList = employerReviewList;
	}

	@Override
	public boolean hasEmployerReview() {
		return employerReviewList != null && employerReviewList.size() > 0 && employerReviewList.get(0) != null;
	}

	public LICENSE(Episode episode) {
		episodeList = new ArrayList<Episode>();
		episodeList.add(episode);
	}

	@Override
	public Episode getEpisode() {
		if(episodeList != null && episodeList.size() > 0) {
			return episodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEpisode(Episode episode) {
		if(episodeList == null) {
			episodeList = new ArrayList<>();
		}
		if(episodeList.size() == 0) {
			episodeList.add(episode);
		} else {
			episodeList.set(0, episode);
		}
	}

	@Override
	public List<Episode> getEpisodeList() {
		return episodeList;
	}

	@Override
	public void setEpisodeList(List<Episode> episodeList) {
		this.episodeList = episodeList;
	}

	@Override
	public boolean hasEpisode() {
		return episodeList != null && episodeList.size() > 0 && episodeList.get(0) != null;
	}

	public LICENSE(ExercisePlan exercisePlan) {
		exercisePlanList = new ArrayList<ExercisePlan>();
		exercisePlanList.add(exercisePlan);
	}

	@Override
	public ExercisePlan getExercisePlan() {
		if(exercisePlanList != null && exercisePlanList.size() > 0) {
			return exercisePlanList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setExercisePlan(ExercisePlan exercisePlan) {
		if(exercisePlanList == null) {
			exercisePlanList = new ArrayList<>();
		}
		if(exercisePlanList.size() == 0) {
			exercisePlanList.add(exercisePlan);
		} else {
			exercisePlanList.set(0, exercisePlan);
		}
	}

	@Override
	public List<ExercisePlan> getExercisePlanList() {
		return exercisePlanList;
	}

	@Override
	public void setExercisePlanList(List<ExercisePlan> exercisePlanList) {
		this.exercisePlanList = exercisePlanList;
	}

	@Override
	public boolean hasExercisePlan() {
		return exercisePlanList != null && exercisePlanList.size() > 0 && exercisePlanList.get(0) != null;
	}

	public LICENSE(FAQPage faqPage) {
		faqPageList = new ArrayList<FAQPage>();
		faqPageList.add(faqPage);
	}

	@Override
	public FAQPage getFAQPage() {
		if(faqPageList != null && faqPageList.size() > 0) {
			return faqPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFAQPage(FAQPage faqPage) {
		if(faqPageList == null) {
			faqPageList = new ArrayList<>();
		}
		if(faqPageList.size() == 0) {
			faqPageList.add(faqPage);
		} else {
			faqPageList.set(0, faqPage);
		}
	}

	@Override
	public List<FAQPage> getFAQPageList() {
		return faqPageList;
	}

	@Override
	public void setFAQPageList(List<FAQPage> faqPageList) {
		this.faqPageList = faqPageList;
	}

	@Override
	public boolean hasFAQPage() {
		return faqPageList != null && faqPageList.size() > 0 && faqPageList.get(0) != null;
	}

	public LICENSE(Game game) {
		gameList = new ArrayList<Game>();
		gameList.add(game);
	}

	@Override
	public Game getGame() {
		if(gameList != null && gameList.size() > 0) {
			return gameList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGame(Game game) {
		if(gameList == null) {
			gameList = new ArrayList<>();
		}
		if(gameList.size() == 0) {
			gameList.add(game);
		} else {
			gameList.set(0, game);
		}
	}

	@Override
	public List<Game> getGameList() {
		return gameList;
	}

	@Override
	public void setGameList(List<Game> gameList) {
		this.gameList = gameList;
	}

	@Override
	public boolean hasGame() {
		return gameList != null && gameList.size() > 0 && gameList.get(0) != null;
	}

	public LICENSE(HowTo howTo) {
		howToList = new ArrayList<HowTo>();
		howToList.add(howTo);
	}

	@Override
	public HowTo getHowTo() {
		if(howToList != null && howToList.size() > 0) {
			return howToList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowTo(HowTo howTo) {
		if(howToList == null) {
			howToList = new ArrayList<>();
		}
		if(howToList.size() == 0) {
			howToList.add(howTo);
		} else {
			howToList.set(0, howTo);
		}
	}

	@Override
	public List<HowTo> getHowToList() {
		return howToList;
	}

	@Override
	public void setHowToList(List<HowTo> howToList) {
		this.howToList = howToList;
	}

	@Override
	public boolean hasHowTo() {
		return howToList != null && howToList.size() > 0 && howToList.get(0) != null;
	}

	public LICENSE(HowToDirection howToDirection) {
		howToDirectionList = new ArrayList<HowToDirection>();
		howToDirectionList.add(howToDirection);
	}

	@Override
	public HowToDirection getHowToDirection() {
		if(howToDirectionList != null && howToDirectionList.size() > 0) {
			return howToDirectionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToDirection(HowToDirection howToDirection) {
		if(howToDirectionList == null) {
			howToDirectionList = new ArrayList<>();
		}
		if(howToDirectionList.size() == 0) {
			howToDirectionList.add(howToDirection);
		} else {
			howToDirectionList.set(0, howToDirection);
		}
	}

	@Override
	public List<HowToDirection> getHowToDirectionList() {
		return howToDirectionList;
	}

	@Override
	public void setHowToDirectionList(List<HowToDirection> howToDirectionList) {
		this.howToDirectionList = howToDirectionList;
	}

	@Override
	public boolean hasHowToDirection() {
		return howToDirectionList != null && howToDirectionList.size() > 0 && howToDirectionList.get(0) != null;
	}

	public LICENSE(HowToSection howToSection) {
		howToSectionList = new ArrayList<HowToSection>();
		howToSectionList.add(howToSection);
	}

	@Override
	public HowToSection getHowToSection() {
		if(howToSectionList != null && howToSectionList.size() > 0) {
			return howToSectionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToSection(HowToSection howToSection) {
		if(howToSectionList == null) {
			howToSectionList = new ArrayList<>();
		}
		if(howToSectionList.size() == 0) {
			howToSectionList.add(howToSection);
		} else {
			howToSectionList.set(0, howToSection);
		}
	}

	@Override
	public List<HowToSection> getHowToSectionList() {
		return howToSectionList;
	}

	@Override
	public void setHowToSectionList(List<HowToSection> howToSectionList) {
		this.howToSectionList = howToSectionList;
	}

	@Override
	public boolean hasHowToSection() {
		return howToSectionList != null && howToSectionList.size() > 0 && howToSectionList.get(0) != null;
	}

	public LICENSE(HowToStep howToStep) {
		howToStepList = new ArrayList<HowToStep>();
		howToStepList.add(howToStep);
	}

	@Override
	public HowToStep getHowToStep() {
		if(howToStepList != null && howToStepList.size() > 0) {
			return howToStepList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToStep(HowToStep howToStep) {
		if(howToStepList == null) {
			howToStepList = new ArrayList<>();
		}
		if(howToStepList.size() == 0) {
			howToStepList.add(howToStep);
		} else {
			howToStepList.set(0, howToStep);
		}
	}

	@Override
	public List<HowToStep> getHowToStepList() {
		return howToStepList;
	}

	@Override
	public void setHowToStepList(List<HowToStep> howToStepList) {
		this.howToStepList = howToStepList;
	}

	@Override
	public boolean hasHowToStep() {
		return howToStepList != null && howToStepList.size() > 0 && howToStepList.get(0) != null;
	}

	public LICENSE(HowToTip howToTip) {
		howToTipList = new ArrayList<HowToTip>();
		howToTipList.add(howToTip);
	}

	@Override
	public HowToTip getHowToTip() {
		if(howToTipList != null && howToTipList.size() > 0) {
			return howToTipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToTip(HowToTip howToTip) {
		if(howToTipList == null) {
			howToTipList = new ArrayList<>();
		}
		if(howToTipList.size() == 0) {
			howToTipList.add(howToTip);
		} else {
			howToTipList.set(0, howToTip);
		}
	}

	@Override
	public List<HowToTip> getHowToTipList() {
		return howToTipList;
	}

	@Override
	public void setHowToTipList(List<HowToTip> howToTipList) {
		this.howToTipList = howToTipList;
	}

	@Override
	public boolean hasHowToTip() {
		return howToTipList != null && howToTipList.size() > 0 && howToTipList.get(0) != null;
	}

	public LICENSE(ImageGallery imageGallery) {
		imageGalleryList = new ArrayList<ImageGallery>();
		imageGalleryList.add(imageGallery);
	}

	@Override
	public ImageGallery getImageGallery() {
		if(imageGalleryList != null && imageGalleryList.size() > 0) {
			return imageGalleryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setImageGallery(ImageGallery imageGallery) {
		if(imageGalleryList == null) {
			imageGalleryList = new ArrayList<>();
		}
		if(imageGalleryList.size() == 0) {
			imageGalleryList.add(imageGallery);
		} else {
			imageGalleryList.set(0, imageGallery);
		}
	}

	@Override
	public List<ImageGallery> getImageGalleryList() {
		return imageGalleryList;
	}

	@Override
	public void setImageGalleryList(List<ImageGallery> imageGalleryList) {
		this.imageGalleryList = imageGalleryList;
	}

	@Override
	public boolean hasImageGallery() {
		return imageGalleryList != null && imageGalleryList.size() > 0 && imageGalleryList.get(0) != null;
	}

	public LICENSE(ImageObject imageObject) {
		imageObjectList = new ArrayList<ImageObject>();
		imageObjectList.add(imageObject);
	}

	@Override
	public ImageObject getImageObject() {
		if(imageObjectList != null && imageObjectList.size() > 0) {
			return imageObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setImageObject(ImageObject imageObject) {
		if(imageObjectList == null) {
			imageObjectList = new ArrayList<>();
		}
		if(imageObjectList.size() == 0) {
			imageObjectList.add(imageObject);
		} else {
			imageObjectList.set(0, imageObject);
		}
	}

	@Override
	public List<ImageObject> getImageObjectList() {
		return imageObjectList;
	}

	@Override
	public void setImageObjectList(List<ImageObject> imageObjectList) {
		this.imageObjectList = imageObjectList;
	}

	@Override
	public boolean hasImageObject() {
		return imageObjectList != null && imageObjectList.size() > 0 && imageObjectList.get(0) != null;
	}

	public LICENSE(ItemPage itemPage) {
		itemPageList = new ArrayList<ItemPage>();
		itemPageList.add(itemPage);
	}

	@Override
	public ItemPage getItemPage() {
		if(itemPageList != null && itemPageList.size() > 0) {
			return itemPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setItemPage(ItemPage itemPage) {
		if(itemPageList == null) {
			itemPageList = new ArrayList<>();
		}
		if(itemPageList.size() == 0) {
			itemPageList.add(itemPage);
		} else {
			itemPageList.set(0, itemPage);
		}
	}

	@Override
	public List<ItemPage> getItemPageList() {
		return itemPageList;
	}

	@Override
	public void setItemPageList(List<ItemPage> itemPageList) {
		this.itemPageList = itemPageList;
	}

	@Override
	public boolean hasItemPage() {
		return itemPageList != null && itemPageList.size() > 0 && itemPageList.get(0) != null;
	}

	public LICENSE(Legislation legislation) {
		legislationList = new ArrayList<Legislation>();
		legislationList.add(legislation);
	}

	@Override
	public Legislation getLegislation() {
		if(legislationList != null && legislationList.size() > 0) {
			return legislationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLegislation(Legislation legislation) {
		if(legislationList == null) {
			legislationList = new ArrayList<>();
		}
		if(legislationList.size() == 0) {
			legislationList.add(legislation);
		} else {
			legislationList.set(0, legislation);
		}
	}

	@Override
	public List<Legislation> getLegislationList() {
		return legislationList;
	}

	@Override
	public void setLegislationList(List<Legislation> legislationList) {
		this.legislationList = legislationList;
	}

	@Override
	public boolean hasLegislation() {
		return legislationList != null && legislationList.size() > 0 && legislationList.get(0) != null;
	}

	public LICENSE(LegislationObject legislationObject) {
		legislationObjectList = new ArrayList<LegislationObject>();
		legislationObjectList.add(legislationObject);
	}

	@Override
	public LegislationObject getLegislationObject() {
		if(legislationObjectList != null && legislationObjectList.size() > 0) {
			return legislationObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLegislationObject(LegislationObject legislationObject) {
		if(legislationObjectList == null) {
			legislationObjectList = new ArrayList<>();
		}
		if(legislationObjectList.size() == 0) {
			legislationObjectList.add(legislationObject);
		} else {
			legislationObjectList.set(0, legislationObject);
		}
	}

	@Override
	public List<LegislationObject> getLegislationObjectList() {
		return legislationObjectList;
	}

	@Override
	public void setLegislationObjectList(List<LegislationObject> legislationObjectList) {
		this.legislationObjectList = legislationObjectList;
	}

	@Override
	public boolean hasLegislationObject() {
		return legislationObjectList != null && legislationObjectList.size() > 0 && legislationObjectList.get(0) != null;
	}

	public LICENSE(LiveBlogPosting liveBlogPosting) {
		liveBlogPostingList = new ArrayList<LiveBlogPosting>();
		liveBlogPostingList.add(liveBlogPosting);
	}

	@Override
	public LiveBlogPosting getLiveBlogPosting() {
		if(liveBlogPostingList != null && liveBlogPostingList.size() > 0) {
			return liveBlogPostingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLiveBlogPosting(LiveBlogPosting liveBlogPosting) {
		if(liveBlogPostingList == null) {
			liveBlogPostingList = new ArrayList<>();
		}
		if(liveBlogPostingList.size() == 0) {
			liveBlogPostingList.add(liveBlogPosting);
		} else {
			liveBlogPostingList.set(0, liveBlogPosting);
		}
	}

	@Override
	public List<LiveBlogPosting> getLiveBlogPostingList() {
		return liveBlogPostingList;
	}

	@Override
	public void setLiveBlogPostingList(List<LiveBlogPosting> liveBlogPostingList) {
		this.liveBlogPostingList = liveBlogPostingList;
	}

	@Override
	public boolean hasLiveBlogPosting() {
		return liveBlogPostingList != null && liveBlogPostingList.size() > 0 && liveBlogPostingList.get(0) != null;
	}

	public LICENSE(Manuscript manuscript) {
		manuscriptList = new ArrayList<Manuscript>();
		manuscriptList.add(manuscript);
	}

	@Override
	public Manuscript getManuscript() {
		if(manuscriptList != null && manuscriptList.size() > 0) {
			return manuscriptList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setManuscript(Manuscript manuscript) {
		if(manuscriptList == null) {
			manuscriptList = new ArrayList<>();
		}
		if(manuscriptList.size() == 0) {
			manuscriptList.add(manuscript);
		} else {
			manuscriptList.set(0, manuscript);
		}
	}

	@Override
	public List<Manuscript> getManuscriptList() {
		return manuscriptList;
	}

	@Override
	public void setManuscriptList(List<Manuscript> manuscriptList) {
		this.manuscriptList = manuscriptList;
	}

	@Override
	public boolean hasManuscript() {
		return manuscriptList != null && manuscriptList.size() > 0 && manuscriptList.get(0) != null;
	}

	public LICENSE(Map map) {
		mapList = new ArrayList<Map>();
		mapList.add(map);
	}

	@Override
	public Map getMap() {
		if(mapList != null && mapList.size() > 0) {
			return mapList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMap(Map map) {
		if(mapList == null) {
			mapList = new ArrayList<>();
		}
		if(mapList.size() == 0) {
			mapList.add(map);
		} else {
			mapList.set(0, map);
		}
	}

	@Override
	public List<Map> getMapList() {
		return mapList;
	}

	@Override
	public void setMapList(List<Map> mapList) {
		this.mapList = mapList;
	}

	@Override
	public boolean hasMap() {
		return mapList != null && mapList.size() > 0 && mapList.get(0) != null;
	}

	public LICENSE(MediaObject mediaObject) {
		mediaObjectList = new ArrayList<MediaObject>();
		mediaObjectList.add(mediaObject);
	}

	@Override
	public MediaObject getMediaObject() {
		if(mediaObjectList != null && mediaObjectList.size() > 0) {
			return mediaObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMediaObject(MediaObject mediaObject) {
		if(mediaObjectList == null) {
			mediaObjectList = new ArrayList<>();
		}
		if(mediaObjectList.size() == 0) {
			mediaObjectList.add(mediaObject);
		} else {
			mediaObjectList.set(0, mediaObject);
		}
	}

	@Override
	public List<MediaObject> getMediaObjectList() {
		return mediaObjectList;
	}

	@Override
	public void setMediaObjectList(List<MediaObject> mediaObjectList) {
		this.mediaObjectList = mediaObjectList;
	}

	@Override
	public boolean hasMediaObject() {
		return mediaObjectList != null && mediaObjectList.size() > 0 && mediaObjectList.get(0) != null;
	}

	public LICENSE(MedicalScholarlyArticle medicalScholarlyArticle) {
		medicalScholarlyArticleList = new ArrayList<MedicalScholarlyArticle>();
		medicalScholarlyArticleList.add(medicalScholarlyArticle);
	}

	@Override
	public MedicalScholarlyArticle getMedicalScholarlyArticle() {
		if(medicalScholarlyArticleList != null && medicalScholarlyArticleList.size() > 0) {
			return medicalScholarlyArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalScholarlyArticle(MedicalScholarlyArticle medicalScholarlyArticle) {
		if(medicalScholarlyArticleList == null) {
			medicalScholarlyArticleList = new ArrayList<>();
		}
		if(medicalScholarlyArticleList.size() == 0) {
			medicalScholarlyArticleList.add(medicalScholarlyArticle);
		} else {
			medicalScholarlyArticleList.set(0, medicalScholarlyArticle);
		}
	}

	@Override
	public List<MedicalScholarlyArticle> getMedicalScholarlyArticleList() {
		return medicalScholarlyArticleList;
	}

	@Override
	public void setMedicalScholarlyArticleList(List<MedicalScholarlyArticle> medicalScholarlyArticleList) {
		this.medicalScholarlyArticleList = medicalScholarlyArticleList;
	}

	@Override
	public boolean hasMedicalScholarlyArticle() {
		return medicalScholarlyArticleList != null && medicalScholarlyArticleList.size() > 0 && medicalScholarlyArticleList.get(0) != null;
	}

	public LICENSE(MedicalWebPage medicalWebPage) {
		medicalWebPageList = new ArrayList<MedicalWebPage>();
		medicalWebPageList.add(medicalWebPage);
	}

	@Override
	public MedicalWebPage getMedicalWebPage() {
		if(medicalWebPageList != null && medicalWebPageList.size() > 0) {
			return medicalWebPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalWebPage(MedicalWebPage medicalWebPage) {
		if(medicalWebPageList == null) {
			medicalWebPageList = new ArrayList<>();
		}
		if(medicalWebPageList.size() == 0) {
			medicalWebPageList.add(medicalWebPage);
		} else {
			medicalWebPageList.set(0, medicalWebPage);
		}
	}

	@Override
	public List<MedicalWebPage> getMedicalWebPageList() {
		return medicalWebPageList;
	}

	@Override
	public void setMedicalWebPageList(List<MedicalWebPage> medicalWebPageList) {
		this.medicalWebPageList = medicalWebPageList;
	}

	@Override
	public boolean hasMedicalWebPage() {
		return medicalWebPageList != null && medicalWebPageList.size() > 0 && medicalWebPageList.get(0) != null;
	}

	public LICENSE(Menu menu) {
		menuList = new ArrayList<Menu>();
		menuList.add(menu);
	}

	@Override
	public Menu getMenu() {
		if(menuList != null && menuList.size() > 0) {
			return menuList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMenu(Menu menu) {
		if(menuList == null) {
			menuList = new ArrayList<>();
		}
		if(menuList.size() == 0) {
			menuList.add(menu);
		} else {
			menuList.set(0, menu);
		}
	}

	@Override
	public List<Menu> getMenuList() {
		return menuList;
	}

	@Override
	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	@Override
	public boolean hasMenu() {
		return menuList != null && menuList.size() > 0 && menuList.get(0) != null;
	}

	public LICENSE(MenuSection menuSection) {
		menuSectionList = new ArrayList<MenuSection>();
		menuSectionList.add(menuSection);
	}

	@Override
	public MenuSection getMenuSection() {
		if(menuSectionList != null && menuSectionList.size() > 0) {
			return menuSectionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMenuSection(MenuSection menuSection) {
		if(menuSectionList == null) {
			menuSectionList = new ArrayList<>();
		}
		if(menuSectionList.size() == 0) {
			menuSectionList.add(menuSection);
		} else {
			menuSectionList.set(0, menuSection);
		}
	}

	@Override
	public List<MenuSection> getMenuSectionList() {
		return menuSectionList;
	}

	@Override
	public void setMenuSectionList(List<MenuSection> menuSectionList) {
		this.menuSectionList = menuSectionList;
	}

	@Override
	public boolean hasMenuSection() {
		return menuSectionList != null && menuSectionList.size() > 0 && menuSectionList.get(0) != null;
	}

	public LICENSE(Message message) {
		messageList = new ArrayList<Message>();
		messageList.add(message);
	}

	@Override
	public Message getMessage() {
		if(messageList != null && messageList.size() > 0) {
			return messageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMessage(Message message) {
		if(messageList == null) {
			messageList = new ArrayList<>();
		}
		if(messageList.size() == 0) {
			messageList.add(message);
		} else {
			messageList.set(0, message);
		}
	}

	@Override
	public List<Message> getMessageList() {
		return messageList;
	}

	@Override
	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}

	@Override
	public boolean hasMessage() {
		return messageList != null && messageList.size() > 0 && messageList.get(0) != null;
	}

	public LICENSE(MobileApplication mobileApplication) {
		mobileApplicationList = new ArrayList<MobileApplication>();
		mobileApplicationList.add(mobileApplication);
	}

	@Override
	public MobileApplication getMobileApplication() {
		if(mobileApplicationList != null && mobileApplicationList.size() > 0) {
			return mobileApplicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMobileApplication(MobileApplication mobileApplication) {
		if(mobileApplicationList == null) {
			mobileApplicationList = new ArrayList<>();
		}
		if(mobileApplicationList.size() == 0) {
			mobileApplicationList.add(mobileApplication);
		} else {
			mobileApplicationList.set(0, mobileApplication);
		}
	}

	@Override
	public List<MobileApplication> getMobileApplicationList() {
		return mobileApplicationList;
	}

	@Override
	public void setMobileApplicationList(List<MobileApplication> mobileApplicationList) {
		this.mobileApplicationList = mobileApplicationList;
	}

	@Override
	public boolean hasMobileApplication() {
		return mobileApplicationList != null && mobileApplicationList.size() > 0 && mobileApplicationList.get(0) != null;
	}

	public LICENSE(Movie movie) {
		movieList = new ArrayList<Movie>();
		movieList.add(movie);
	}

	@Override
	public Movie getMovie() {
		if(movieList != null && movieList.size() > 0) {
			return movieList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMovie(Movie movie) {
		if(movieList == null) {
			movieList = new ArrayList<>();
		}
		if(movieList.size() == 0) {
			movieList.add(movie);
		} else {
			movieList.set(0, movie);
		}
	}

	@Override
	public List<Movie> getMovieList() {
		return movieList;
	}

	@Override
	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

	@Override
	public boolean hasMovie() {
		return movieList != null && movieList.size() > 0 && movieList.get(0) != null;
	}

	public LICENSE(MovieClip movieClip) {
		movieClipList = new ArrayList<MovieClip>();
		movieClipList.add(movieClip);
	}

	@Override
	public MovieClip getMovieClip() {
		if(movieClipList != null && movieClipList.size() > 0) {
			return movieClipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMovieClip(MovieClip movieClip) {
		if(movieClipList == null) {
			movieClipList = new ArrayList<>();
		}
		if(movieClipList.size() == 0) {
			movieClipList.add(movieClip);
		} else {
			movieClipList.set(0, movieClip);
		}
	}

	@Override
	public List<MovieClip> getMovieClipList() {
		return movieClipList;
	}

	@Override
	public void setMovieClipList(List<MovieClip> movieClipList) {
		this.movieClipList = movieClipList;
	}

	@Override
	public boolean hasMovieClip() {
		return movieClipList != null && movieClipList.size() > 0 && movieClipList.get(0) != null;
	}

	public LICENSE(MovieSeries movieSeries) {
		movieSeriesList = new ArrayList<MovieSeries>();
		movieSeriesList.add(movieSeries);
	}

	@Override
	public MovieSeries getMovieSeries() {
		if(movieSeriesList != null && movieSeriesList.size() > 0) {
			return movieSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMovieSeries(MovieSeries movieSeries) {
		if(movieSeriesList == null) {
			movieSeriesList = new ArrayList<>();
		}
		if(movieSeriesList.size() == 0) {
			movieSeriesList.add(movieSeries);
		} else {
			movieSeriesList.set(0, movieSeries);
		}
	}

	@Override
	public List<MovieSeries> getMovieSeriesList() {
		return movieSeriesList;
	}

	@Override
	public void setMovieSeriesList(List<MovieSeries> movieSeriesList) {
		this.movieSeriesList = movieSeriesList;
	}

	@Override
	public boolean hasMovieSeries() {
		return movieSeriesList != null && movieSeriesList.size() > 0 && movieSeriesList.get(0) != null;
	}

	public LICENSE(MusicAlbum musicAlbum) {
		musicAlbumList = new ArrayList<MusicAlbum>();
		musicAlbumList.add(musicAlbum);
	}

	@Override
	public MusicAlbum getMusicAlbum() {
		if(musicAlbumList != null && musicAlbumList.size() > 0) {
			return musicAlbumList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicAlbum(MusicAlbum musicAlbum) {
		if(musicAlbumList == null) {
			musicAlbumList = new ArrayList<>();
		}
		if(musicAlbumList.size() == 0) {
			musicAlbumList.add(musicAlbum);
		} else {
			musicAlbumList.set(0, musicAlbum);
		}
	}

	@Override
	public List<MusicAlbum> getMusicAlbumList() {
		return musicAlbumList;
	}

	@Override
	public void setMusicAlbumList(List<MusicAlbum> musicAlbumList) {
		this.musicAlbumList = musicAlbumList;
	}

	@Override
	public boolean hasMusicAlbum() {
		return musicAlbumList != null && musicAlbumList.size() > 0 && musicAlbumList.get(0) != null;
	}

	public LICENSE(MusicComposition musicComposition) {
		musicCompositionList = new ArrayList<MusicComposition>();
		musicCompositionList.add(musicComposition);
	}

	@Override
	public MusicComposition getMusicComposition() {
		if(musicCompositionList != null && musicCompositionList.size() > 0) {
			return musicCompositionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicComposition(MusicComposition musicComposition) {
		if(musicCompositionList == null) {
			musicCompositionList = new ArrayList<>();
		}
		if(musicCompositionList.size() == 0) {
			musicCompositionList.add(musicComposition);
		} else {
			musicCompositionList.set(0, musicComposition);
		}
	}

	@Override
	public List<MusicComposition> getMusicCompositionList() {
		return musicCompositionList;
	}

	@Override
	public void setMusicCompositionList(List<MusicComposition> musicCompositionList) {
		this.musicCompositionList = musicCompositionList;
	}

	@Override
	public boolean hasMusicComposition() {
		return musicCompositionList != null && musicCompositionList.size() > 0 && musicCompositionList.get(0) != null;
	}

	public LICENSE(MusicPlaylist musicPlaylist) {
		musicPlaylistList = new ArrayList<MusicPlaylist>();
		musicPlaylistList.add(musicPlaylist);
	}

	@Override
	public MusicPlaylist getMusicPlaylist() {
		if(musicPlaylistList != null && musicPlaylistList.size() > 0) {
			return musicPlaylistList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicPlaylist(MusicPlaylist musicPlaylist) {
		if(musicPlaylistList == null) {
			musicPlaylistList = new ArrayList<>();
		}
		if(musicPlaylistList.size() == 0) {
			musicPlaylistList.add(musicPlaylist);
		} else {
			musicPlaylistList.set(0, musicPlaylist);
		}
	}

	@Override
	public List<MusicPlaylist> getMusicPlaylistList() {
		return musicPlaylistList;
	}

	@Override
	public void setMusicPlaylistList(List<MusicPlaylist> musicPlaylistList) {
		this.musicPlaylistList = musicPlaylistList;
	}

	@Override
	public boolean hasMusicPlaylist() {
		return musicPlaylistList != null && musicPlaylistList.size() > 0 && musicPlaylistList.get(0) != null;
	}

	public LICENSE(MusicRecording musicRecording) {
		musicRecordingList = new ArrayList<MusicRecording>();
		musicRecordingList.add(musicRecording);
	}

	@Override
	public MusicRecording getMusicRecording() {
		if(musicRecordingList != null && musicRecordingList.size() > 0) {
			return musicRecordingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicRecording(MusicRecording musicRecording) {
		if(musicRecordingList == null) {
			musicRecordingList = new ArrayList<>();
		}
		if(musicRecordingList.size() == 0) {
			musicRecordingList.add(musicRecording);
		} else {
			musicRecordingList.set(0, musicRecording);
		}
	}

	@Override
	public List<MusicRecording> getMusicRecordingList() {
		return musicRecordingList;
	}

	@Override
	public void setMusicRecordingList(List<MusicRecording> musicRecordingList) {
		this.musicRecordingList = musicRecordingList;
	}

	@Override
	public boolean hasMusicRecording() {
		return musicRecordingList != null && musicRecordingList.size() > 0 && musicRecordingList.get(0) != null;
	}

	public LICENSE(MusicRelease musicRelease) {
		musicReleaseList = new ArrayList<MusicRelease>();
		musicReleaseList.add(musicRelease);
	}

	@Override
	public MusicRelease getMusicRelease() {
		if(musicReleaseList != null && musicReleaseList.size() > 0) {
			return musicReleaseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicRelease(MusicRelease musicRelease) {
		if(musicReleaseList == null) {
			musicReleaseList = new ArrayList<>();
		}
		if(musicReleaseList.size() == 0) {
			musicReleaseList.add(musicRelease);
		} else {
			musicReleaseList.set(0, musicRelease);
		}
	}

	@Override
	public List<MusicRelease> getMusicReleaseList() {
		return musicReleaseList;
	}

	@Override
	public void setMusicReleaseList(List<MusicRelease> musicReleaseList) {
		this.musicReleaseList = musicReleaseList;
	}

	@Override
	public boolean hasMusicRelease() {
		return musicReleaseList != null && musicReleaseList.size() > 0 && musicReleaseList.get(0) != null;
	}

	public LICENSE(MusicVideoObject musicVideoObject) {
		musicVideoObjectList = new ArrayList<MusicVideoObject>();
		musicVideoObjectList.add(musicVideoObject);
	}

	@Override
	public MusicVideoObject getMusicVideoObject() {
		if(musicVideoObjectList != null && musicVideoObjectList.size() > 0) {
			return musicVideoObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicVideoObject(MusicVideoObject musicVideoObject) {
		if(musicVideoObjectList == null) {
			musicVideoObjectList = new ArrayList<>();
		}
		if(musicVideoObjectList.size() == 0) {
			musicVideoObjectList.add(musicVideoObject);
		} else {
			musicVideoObjectList.set(0, musicVideoObject);
		}
	}

	@Override
	public List<MusicVideoObject> getMusicVideoObjectList() {
		return musicVideoObjectList;
	}

	@Override
	public void setMusicVideoObjectList(List<MusicVideoObject> musicVideoObjectList) {
		this.musicVideoObjectList = musicVideoObjectList;
	}

	@Override
	public boolean hasMusicVideoObject() {
		return musicVideoObjectList != null && musicVideoObjectList.size() > 0 && musicVideoObjectList.get(0) != null;
	}

	public LICENSE(NewsArticle newsArticle) {
		newsArticleList = new ArrayList<NewsArticle>();
		newsArticleList.add(newsArticle);
	}

	@Override
	public NewsArticle getNewsArticle() {
		if(newsArticleList != null && newsArticleList.size() > 0) {
			return newsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNewsArticle(NewsArticle newsArticle) {
		if(newsArticleList == null) {
			newsArticleList = new ArrayList<>();
		}
		if(newsArticleList.size() == 0) {
			newsArticleList.add(newsArticle);
		} else {
			newsArticleList.set(0, newsArticle);
		}
	}

	@Override
	public List<NewsArticle> getNewsArticleList() {
		return newsArticleList;
	}

	@Override
	public void setNewsArticleList(List<NewsArticle> newsArticleList) {
		this.newsArticleList = newsArticleList;
	}

	@Override
	public boolean hasNewsArticle() {
		return newsArticleList != null && newsArticleList.size() > 0 && newsArticleList.get(0) != null;
	}

	public LICENSE(Newspaper newspaper) {
		newspaperList = new ArrayList<Newspaper>();
		newspaperList.add(newspaper);
	}

	@Override
	public Newspaper getNewspaper() {
		if(newspaperList != null && newspaperList.size() > 0) {
			return newspaperList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNewspaper(Newspaper newspaper) {
		if(newspaperList == null) {
			newspaperList = new ArrayList<>();
		}
		if(newspaperList.size() == 0) {
			newspaperList.add(newspaper);
		} else {
			newspaperList.set(0, newspaper);
		}
	}

	@Override
	public List<Newspaper> getNewspaperList() {
		return newspaperList;
	}

	@Override
	public void setNewspaperList(List<Newspaper> newspaperList) {
		this.newspaperList = newspaperList;
	}

	@Override
	public boolean hasNewspaper() {
		return newspaperList != null && newspaperList.size() > 0 && newspaperList.get(0) != null;
	}

	public LICENSE(NoteDigitalDocument noteDigitalDocument) {
		noteDigitalDocumentList = new ArrayList<NoteDigitalDocument>();
		noteDigitalDocumentList.add(noteDigitalDocument);
	}

	@Override
	public NoteDigitalDocument getNoteDigitalDocument() {
		if(noteDigitalDocumentList != null && noteDigitalDocumentList.size() > 0) {
			return noteDigitalDocumentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNoteDigitalDocument(NoteDigitalDocument noteDigitalDocument) {
		if(noteDigitalDocumentList == null) {
			noteDigitalDocumentList = new ArrayList<>();
		}
		if(noteDigitalDocumentList.size() == 0) {
			noteDigitalDocumentList.add(noteDigitalDocument);
		} else {
			noteDigitalDocumentList.set(0, noteDigitalDocument);
		}
	}

	@Override
	public List<NoteDigitalDocument> getNoteDigitalDocumentList() {
		return noteDigitalDocumentList;
	}

	@Override
	public void setNoteDigitalDocumentList(List<NoteDigitalDocument> noteDigitalDocumentList) {
		this.noteDigitalDocumentList = noteDigitalDocumentList;
	}

	@Override
	public boolean hasNoteDigitalDocument() {
		return noteDigitalDocumentList != null && noteDigitalDocumentList.size() > 0 && noteDigitalDocumentList.get(0) != null;
	}

	public LICENSE(OpinionNewsArticle opinionNewsArticle) {
		opinionNewsArticleList = new ArrayList<OpinionNewsArticle>();
		opinionNewsArticleList.add(opinionNewsArticle);
	}

	@Override
	public OpinionNewsArticle getOpinionNewsArticle() {
		if(opinionNewsArticleList != null && opinionNewsArticleList.size() > 0) {
			return opinionNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOpinionNewsArticle(OpinionNewsArticle opinionNewsArticle) {
		if(opinionNewsArticleList == null) {
			opinionNewsArticleList = new ArrayList<>();
		}
		if(opinionNewsArticleList.size() == 0) {
			opinionNewsArticleList.add(opinionNewsArticle);
		} else {
			opinionNewsArticleList.set(0, opinionNewsArticle);
		}
	}

	@Override
	public List<OpinionNewsArticle> getOpinionNewsArticleList() {
		return opinionNewsArticleList;
	}

	@Override
	public void setOpinionNewsArticleList(List<OpinionNewsArticle> opinionNewsArticleList) {
		this.opinionNewsArticleList = opinionNewsArticleList;
	}

	@Override
	public boolean hasOpinionNewsArticle() {
		return opinionNewsArticleList != null && opinionNewsArticleList.size() > 0 && opinionNewsArticleList.get(0) != null;
	}

	public LICENSE(Painting painting) {
		paintingList = new ArrayList<Painting>();
		paintingList.add(painting);
	}

	@Override
	public Painting getPainting() {
		if(paintingList != null && paintingList.size() > 0) {
			return paintingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPainting(Painting painting) {
		if(paintingList == null) {
			paintingList = new ArrayList<>();
		}
		if(paintingList.size() == 0) {
			paintingList.add(painting);
		} else {
			paintingList.set(0, painting);
		}
	}

	@Override
	public List<Painting> getPaintingList() {
		return paintingList;
	}

	@Override
	public void setPaintingList(List<Painting> paintingList) {
		this.paintingList = paintingList;
	}

	@Override
	public boolean hasPainting() {
		return paintingList != null && paintingList.size() > 0 && paintingList.get(0) != null;
	}

	public LICENSE(Periodical periodical) {
		periodicalList = new ArrayList<Periodical>();
		periodicalList.add(periodical);
	}

	@Override
	public Periodical getPeriodical() {
		if(periodicalList != null && periodicalList.size() > 0) {
			return periodicalList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPeriodical(Periodical periodical) {
		if(periodicalList == null) {
			periodicalList = new ArrayList<>();
		}
		if(periodicalList.size() == 0) {
			periodicalList.add(periodical);
		} else {
			periodicalList.set(0, periodical);
		}
	}

	@Override
	public List<Periodical> getPeriodicalList() {
		return periodicalList;
	}

	@Override
	public void setPeriodicalList(List<Periodical> periodicalList) {
		this.periodicalList = periodicalList;
	}

	@Override
	public boolean hasPeriodical() {
		return periodicalList != null && periodicalList.size() > 0 && periodicalList.get(0) != null;
	}

	public LICENSE(Photograph photograph) {
		photographList = new ArrayList<Photograph>();
		photographList.add(photograph);
	}

	@Override
	public Photograph getPhotograph() {
		if(photographList != null && photographList.size() > 0) {
			return photographList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhotograph(Photograph photograph) {
		if(photographList == null) {
			photographList = new ArrayList<>();
		}
		if(photographList.size() == 0) {
			photographList.add(photograph);
		} else {
			photographList.set(0, photograph);
		}
	}

	@Override
	public List<Photograph> getPhotographList() {
		return photographList;
	}

	@Override
	public void setPhotographList(List<Photograph> photographList) {
		this.photographList = photographList;
	}

	@Override
	public boolean hasPhotograph() {
		return photographList != null && photographList.size() > 0 && photographList.get(0) != null;
	}

	public LICENSE(Play play) {
		playList = new ArrayList<Play>();
		playList.add(play);
	}

	@Override
	public Play getPlay() {
		if(playList != null && playList.size() > 0) {
			return playList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPlay(Play play) {
		if(playList == null) {
			playList = new ArrayList<>();
		}
		if(playList.size() == 0) {
			playList.add(play);
		} else {
			playList.set(0, play);
		}
	}

	@Override
	public List<Play> getPlayList() {
		return playList;
	}

	@Override
	public void setPlayList(List<Play> playList) {
		this.playList = playList;
	}

	@Override
	public boolean hasPlay() {
		return playList != null && playList.size() > 0 && playList.get(0) != null;
	}

	public LICENSE(Poster poster) {
		posterList = new ArrayList<Poster>();
		posterList.add(poster);
	}

	@Override
	public Poster getPoster() {
		if(posterList != null && posterList.size() > 0) {
			return posterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPoster(Poster poster) {
		if(posterList == null) {
			posterList = new ArrayList<>();
		}
		if(posterList.size() == 0) {
			posterList.add(poster);
		} else {
			posterList.set(0, poster);
		}
	}

	@Override
	public List<Poster> getPosterList() {
		return posterList;
	}

	@Override
	public void setPosterList(List<Poster> posterList) {
		this.posterList = posterList;
	}

	@Override
	public boolean hasPoster() {
		return posterList != null && posterList.size() > 0 && posterList.get(0) != null;
	}

	public LICENSE(PresentationDigitalDocument presentationDigitalDocument) {
		presentationDigitalDocumentList = new ArrayList<PresentationDigitalDocument>();
		presentationDigitalDocumentList.add(presentationDigitalDocument);
	}

	@Override
	public PresentationDigitalDocument getPresentationDigitalDocument() {
		if(presentationDigitalDocumentList != null && presentationDigitalDocumentList.size() > 0) {
			return presentationDigitalDocumentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPresentationDigitalDocument(PresentationDigitalDocument presentationDigitalDocument) {
		if(presentationDigitalDocumentList == null) {
			presentationDigitalDocumentList = new ArrayList<>();
		}
		if(presentationDigitalDocumentList.size() == 0) {
			presentationDigitalDocumentList.add(presentationDigitalDocument);
		} else {
			presentationDigitalDocumentList.set(0, presentationDigitalDocument);
		}
	}

	@Override
	public List<PresentationDigitalDocument> getPresentationDigitalDocumentList() {
		return presentationDigitalDocumentList;
	}

	@Override
	public void setPresentationDigitalDocumentList(List<PresentationDigitalDocument> presentationDigitalDocumentList) {
		this.presentationDigitalDocumentList = presentationDigitalDocumentList;
	}

	@Override
	public boolean hasPresentationDigitalDocument() {
		return presentationDigitalDocumentList != null && presentationDigitalDocumentList.size() > 0 && presentationDigitalDocumentList.get(0) != null;
	}

	public LICENSE(ProfilePage profilePage) {
		profilePageList = new ArrayList<ProfilePage>();
		profilePageList.add(profilePage);
	}

	@Override
	public ProfilePage getProfilePage() {
		if(profilePageList != null && profilePageList.size() > 0) {
			return profilePageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProfilePage(ProfilePage profilePage) {
		if(profilePageList == null) {
			profilePageList = new ArrayList<>();
		}
		if(profilePageList.size() == 0) {
			profilePageList.add(profilePage);
		} else {
			profilePageList.set(0, profilePage);
		}
	}

	@Override
	public List<ProfilePage> getProfilePageList() {
		return profilePageList;
	}

	@Override
	public void setProfilePageList(List<ProfilePage> profilePageList) {
		this.profilePageList = profilePageList;
	}

	@Override
	public boolean hasProfilePage() {
		return profilePageList != null && profilePageList.size() > 0 && profilePageList.get(0) != null;
	}

	public LICENSE(PublicationIssue publicationIssue) {
		publicationIssueList = new ArrayList<PublicationIssue>();
		publicationIssueList.add(publicationIssue);
	}

	@Override
	public PublicationIssue getPublicationIssue() {
		if(publicationIssueList != null && publicationIssueList.size() > 0) {
			return publicationIssueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPublicationIssue(PublicationIssue publicationIssue) {
		if(publicationIssueList == null) {
			publicationIssueList = new ArrayList<>();
		}
		if(publicationIssueList.size() == 0) {
			publicationIssueList.add(publicationIssue);
		} else {
			publicationIssueList.set(0, publicationIssue);
		}
	}

	@Override
	public List<PublicationIssue> getPublicationIssueList() {
		return publicationIssueList;
	}

	@Override
	public void setPublicationIssueList(List<PublicationIssue> publicationIssueList) {
		this.publicationIssueList = publicationIssueList;
	}

	@Override
	public boolean hasPublicationIssue() {
		return publicationIssueList != null && publicationIssueList.size() > 0 && publicationIssueList.get(0) != null;
	}

	public LICENSE(PublicationVolume publicationVolume) {
		publicationVolumeList = new ArrayList<PublicationVolume>();
		publicationVolumeList.add(publicationVolume);
	}

	@Override
	public PublicationVolume getPublicationVolume() {
		if(publicationVolumeList != null && publicationVolumeList.size() > 0) {
			return publicationVolumeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPublicationVolume(PublicationVolume publicationVolume) {
		if(publicationVolumeList == null) {
			publicationVolumeList = new ArrayList<>();
		}
		if(publicationVolumeList.size() == 0) {
			publicationVolumeList.add(publicationVolume);
		} else {
			publicationVolumeList.set(0, publicationVolume);
		}
	}

	@Override
	public List<PublicationVolume> getPublicationVolumeList() {
		return publicationVolumeList;
	}

	@Override
	public void setPublicationVolumeList(List<PublicationVolume> publicationVolumeList) {
		this.publicationVolumeList = publicationVolumeList;
	}

	@Override
	public boolean hasPublicationVolume() {
		return publicationVolumeList != null && publicationVolumeList.size() > 0 && publicationVolumeList.get(0) != null;
	}

	public LICENSE(QAPage qaPage) {
		qaPageList = new ArrayList<QAPage>();
		qaPageList.add(qaPage);
	}

	@Override
	public QAPage getQAPage() {
		if(qaPageList != null && qaPageList.size() > 0) {
			return qaPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQAPage(QAPage qaPage) {
		if(qaPageList == null) {
			qaPageList = new ArrayList<>();
		}
		if(qaPageList.size() == 0) {
			qaPageList.add(qaPage);
		} else {
			qaPageList.set(0, qaPage);
		}
	}

	@Override
	public List<QAPage> getQAPageList() {
		return qaPageList;
	}

	@Override
	public void setQAPageList(List<QAPage> qaPageList) {
		this.qaPageList = qaPageList;
	}

	@Override
	public boolean hasQAPage() {
		return qaPageList != null && qaPageList.size() > 0 && qaPageList.get(0) != null;
	}

	public LICENSE(Question question) {
		questionList = new ArrayList<Question>();
		questionList.add(question);
	}

	@Override
	public Question getQuestion() {
		if(questionList != null && questionList.size() > 0) {
			return questionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuestion(Question question) {
		if(questionList == null) {
			questionList = new ArrayList<>();
		}
		if(questionList.size() == 0) {
			questionList.add(question);
		} else {
			questionList.set(0, question);
		}
	}

	@Override
	public List<Question> getQuestionList() {
		return questionList;
	}

	@Override
	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}

	@Override
	public boolean hasQuestion() {
		return questionList != null && questionList.size() > 0 && questionList.get(0) != null;
	}

	public LICENSE(Quotation quotation) {
		quotationList = new ArrayList<Quotation>();
		quotationList.add(quotation);
	}

	@Override
	public Quotation getQuotation() {
		if(quotationList != null && quotationList.size() > 0) {
			return quotationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuotation(Quotation quotation) {
		if(quotationList == null) {
			quotationList = new ArrayList<>();
		}
		if(quotationList.size() == 0) {
			quotationList.add(quotation);
		} else {
			quotationList.set(0, quotation);
		}
	}

	@Override
	public List<Quotation> getQuotationList() {
		return quotationList;
	}

	@Override
	public void setQuotationList(List<Quotation> quotationList) {
		this.quotationList = quotationList;
	}

	@Override
	public boolean hasQuotation() {
		return quotationList != null && quotationList.size() > 0 && quotationList.get(0) != null;
	}

	public LICENSE(RadioClip radioClip) {
		radioClipList = new ArrayList<RadioClip>();
		radioClipList.add(radioClip);
	}

	@Override
	public RadioClip getRadioClip() {
		if(radioClipList != null && radioClipList.size() > 0) {
			return radioClipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioClip(RadioClip radioClip) {
		if(radioClipList == null) {
			radioClipList = new ArrayList<>();
		}
		if(radioClipList.size() == 0) {
			radioClipList.add(radioClip);
		} else {
			radioClipList.set(0, radioClip);
		}
	}

	@Override
	public List<RadioClip> getRadioClipList() {
		return radioClipList;
	}

	@Override
	public void setRadioClipList(List<RadioClip> radioClipList) {
		this.radioClipList = radioClipList;
	}

	@Override
	public boolean hasRadioClip() {
		return radioClipList != null && radioClipList.size() > 0 && radioClipList.get(0) != null;
	}

	public LICENSE(RadioEpisode radioEpisode) {
		radioEpisodeList = new ArrayList<RadioEpisode>();
		radioEpisodeList.add(radioEpisode);
	}

	@Override
	public RadioEpisode getRadioEpisode() {
		if(radioEpisodeList != null && radioEpisodeList.size() > 0) {
			return radioEpisodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioEpisode(RadioEpisode radioEpisode) {
		if(radioEpisodeList == null) {
			radioEpisodeList = new ArrayList<>();
		}
		if(radioEpisodeList.size() == 0) {
			radioEpisodeList.add(radioEpisode);
		} else {
			radioEpisodeList.set(0, radioEpisode);
		}
	}

	@Override
	public List<RadioEpisode> getRadioEpisodeList() {
		return radioEpisodeList;
	}

	@Override
	public void setRadioEpisodeList(List<RadioEpisode> radioEpisodeList) {
		this.radioEpisodeList = radioEpisodeList;
	}

	@Override
	public boolean hasRadioEpisode() {
		return radioEpisodeList != null && radioEpisodeList.size() > 0 && radioEpisodeList.get(0) != null;
	}

	public LICENSE(RadioSeason radioSeason) {
		radioSeasonList = new ArrayList<RadioSeason>();
		radioSeasonList.add(radioSeason);
	}

	@Override
	public RadioSeason getRadioSeason() {
		if(radioSeasonList != null && radioSeasonList.size() > 0) {
			return radioSeasonList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioSeason(RadioSeason radioSeason) {
		if(radioSeasonList == null) {
			radioSeasonList = new ArrayList<>();
		}
		if(radioSeasonList.size() == 0) {
			radioSeasonList.add(radioSeason);
		} else {
			radioSeasonList.set(0, radioSeason);
		}
	}

	@Override
	public List<RadioSeason> getRadioSeasonList() {
		return radioSeasonList;
	}

	@Override
	public void setRadioSeasonList(List<RadioSeason> radioSeasonList) {
		this.radioSeasonList = radioSeasonList;
	}

	@Override
	public boolean hasRadioSeason() {
		return radioSeasonList != null && radioSeasonList.size() > 0 && radioSeasonList.get(0) != null;
	}

	public LICENSE(RadioSeries radioSeries) {
		radioSeriesList = new ArrayList<RadioSeries>();
		radioSeriesList.add(radioSeries);
	}

	@Override
	public RadioSeries getRadioSeries() {
		if(radioSeriesList != null && radioSeriesList.size() > 0) {
			return radioSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioSeries(RadioSeries radioSeries) {
		if(radioSeriesList == null) {
			radioSeriesList = new ArrayList<>();
		}
		if(radioSeriesList.size() == 0) {
			radioSeriesList.add(radioSeries);
		} else {
			radioSeriesList.set(0, radioSeries);
		}
	}

	@Override
	public List<RadioSeries> getRadioSeriesList() {
		return radioSeriesList;
	}

	@Override
	public void setRadioSeriesList(List<RadioSeries> radioSeriesList) {
		this.radioSeriesList = radioSeriesList;
	}

	@Override
	public boolean hasRadioSeries() {
		return radioSeriesList != null && radioSeriesList.size() > 0 && radioSeriesList.get(0) != null;
	}

	public LICENSE(Recipe recipe) {
		recipeList = new ArrayList<Recipe>();
		recipeList.add(recipe);
	}

	@Override
	public Recipe getRecipe() {
		if(recipeList != null && recipeList.size() > 0) {
			return recipeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRecipe(Recipe recipe) {
		if(recipeList == null) {
			recipeList = new ArrayList<>();
		}
		if(recipeList.size() == 0) {
			recipeList.add(recipe);
		} else {
			recipeList.set(0, recipe);
		}
	}

	@Override
	public List<Recipe> getRecipeList() {
		return recipeList;
	}

	@Override
	public void setRecipeList(List<Recipe> recipeList) {
		this.recipeList = recipeList;
	}

	@Override
	public boolean hasRecipe() {
		return recipeList != null && recipeList.size() > 0 && recipeList.get(0) != null;
	}

	public LICENSE(Report report) {
		reportList = new ArrayList<Report>();
		reportList.add(report);
	}

	@Override
	public Report getReport() {
		if(reportList != null && reportList.size() > 0) {
			return reportList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReport(Report report) {
		if(reportList == null) {
			reportList = new ArrayList<>();
		}
		if(reportList.size() == 0) {
			reportList.add(report);
		} else {
			reportList.set(0, report);
		}
	}

	@Override
	public List<Report> getReportList() {
		return reportList;
	}

	@Override
	public void setReportList(List<Report> reportList) {
		this.reportList = reportList;
	}

	@Override
	public boolean hasReport() {
		return reportList != null && reportList.size() > 0 && reportList.get(0) != null;
	}

	public LICENSE(ReportageNewsArticle reportageNewsArticle) {
		reportageNewsArticleList = new ArrayList<ReportageNewsArticle>();
		reportageNewsArticleList.add(reportageNewsArticle);
	}

	@Override
	public ReportageNewsArticle getReportageNewsArticle() {
		if(reportageNewsArticleList != null && reportageNewsArticleList.size() > 0) {
			return reportageNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReportageNewsArticle(ReportageNewsArticle reportageNewsArticle) {
		if(reportageNewsArticleList == null) {
			reportageNewsArticleList = new ArrayList<>();
		}
		if(reportageNewsArticleList.size() == 0) {
			reportageNewsArticleList.add(reportageNewsArticle);
		} else {
			reportageNewsArticleList.set(0, reportageNewsArticle);
		}
	}

	@Override
	public List<ReportageNewsArticle> getReportageNewsArticleList() {
		return reportageNewsArticleList;
	}

	@Override
	public void setReportageNewsArticleList(List<ReportageNewsArticle> reportageNewsArticleList) {
		this.reportageNewsArticleList = reportageNewsArticleList;
	}

	@Override
	public boolean hasReportageNewsArticle() {
		return reportageNewsArticleList != null && reportageNewsArticleList.size() > 0 && reportageNewsArticleList.get(0) != null;
	}

	public LICENSE(Review review) {
		reviewList = new ArrayList<Review>();
		reviewList.add(review);
	}

	@Override
	public Review getReview() {
		if(reviewList != null && reviewList.size() > 0) {
			return reviewList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReview(Review review) {
		if(reviewList == null) {
			reviewList = new ArrayList<>();
		}
		if(reviewList.size() == 0) {
			reviewList.add(review);
		} else {
			reviewList.set(0, review);
		}
	}

	@Override
	public List<Review> getReviewList() {
		return reviewList;
	}

	@Override
	public void setReviewList(List<Review> reviewList) {
		this.reviewList = reviewList;
	}

	@Override
	public boolean hasReview() {
		return reviewList != null && reviewList.size() > 0 && reviewList.get(0) != null;
	}

	public LICENSE(ReviewNewsArticle reviewNewsArticle) {
		reviewNewsArticleList = new ArrayList<ReviewNewsArticle>();
		reviewNewsArticleList.add(reviewNewsArticle);
	}

	@Override
	public ReviewNewsArticle getReviewNewsArticle() {
		if(reviewNewsArticleList != null && reviewNewsArticleList.size() > 0) {
			return reviewNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReviewNewsArticle(ReviewNewsArticle reviewNewsArticle) {
		if(reviewNewsArticleList == null) {
			reviewNewsArticleList = new ArrayList<>();
		}
		if(reviewNewsArticleList.size() == 0) {
			reviewNewsArticleList.add(reviewNewsArticle);
		} else {
			reviewNewsArticleList.set(0, reviewNewsArticle);
		}
	}

	@Override
	public List<ReviewNewsArticle> getReviewNewsArticleList() {
		return reviewNewsArticleList;
	}

	@Override
	public void setReviewNewsArticleList(List<ReviewNewsArticle> reviewNewsArticleList) {
		this.reviewNewsArticleList = reviewNewsArticleList;
	}

	@Override
	public boolean hasReviewNewsArticle() {
		return reviewNewsArticleList != null && reviewNewsArticleList.size() > 0 && reviewNewsArticleList.get(0) != null;
	}

	public LICENSE(SatiricalArticle satiricalArticle) {
		satiricalArticleList = new ArrayList<SatiricalArticle>();
		satiricalArticleList.add(satiricalArticle);
	}

	@Override
	public SatiricalArticle getSatiricalArticle() {
		if(satiricalArticleList != null && satiricalArticleList.size() > 0) {
			return satiricalArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSatiricalArticle(SatiricalArticle satiricalArticle) {
		if(satiricalArticleList == null) {
			satiricalArticleList = new ArrayList<>();
		}
		if(satiricalArticleList.size() == 0) {
			satiricalArticleList.add(satiricalArticle);
		} else {
			satiricalArticleList.set(0, satiricalArticle);
		}
	}

	@Override
	public List<SatiricalArticle> getSatiricalArticleList() {
		return satiricalArticleList;
	}

	@Override
	public void setSatiricalArticleList(List<SatiricalArticle> satiricalArticleList) {
		this.satiricalArticleList = satiricalArticleList;
	}

	@Override
	public boolean hasSatiricalArticle() {
		return satiricalArticleList != null && satiricalArticleList.size() > 0 && satiricalArticleList.get(0) != null;
	}

	public LICENSE(ScholarlyArticle scholarlyArticle) {
		scholarlyArticleList = new ArrayList<ScholarlyArticle>();
		scholarlyArticleList.add(scholarlyArticle);
	}

	@Override
	public ScholarlyArticle getScholarlyArticle() {
		if(scholarlyArticleList != null && scholarlyArticleList.size() > 0) {
			return scholarlyArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setScholarlyArticle(ScholarlyArticle scholarlyArticle) {
		if(scholarlyArticleList == null) {
			scholarlyArticleList = new ArrayList<>();
		}
		if(scholarlyArticleList.size() == 0) {
			scholarlyArticleList.add(scholarlyArticle);
		} else {
			scholarlyArticleList.set(0, scholarlyArticle);
		}
	}

	@Override
	public List<ScholarlyArticle> getScholarlyArticleList() {
		return scholarlyArticleList;
	}

	@Override
	public void setScholarlyArticleList(List<ScholarlyArticle> scholarlyArticleList) {
		this.scholarlyArticleList = scholarlyArticleList;
	}

	@Override
	public boolean hasScholarlyArticle() {
		return scholarlyArticleList != null && scholarlyArticleList.size() > 0 && scholarlyArticleList.get(0) != null;
	}

	public LICENSE(Sculpture sculpture) {
		sculptureList = new ArrayList<Sculpture>();
		sculptureList.add(sculpture);
	}

	@Override
	public Sculpture getSculpture() {
		if(sculptureList != null && sculptureList.size() > 0) {
			return sculptureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSculpture(Sculpture sculpture) {
		if(sculptureList == null) {
			sculptureList = new ArrayList<>();
		}
		if(sculptureList.size() == 0) {
			sculptureList.add(sculpture);
		} else {
			sculptureList.set(0, sculpture);
		}
	}

	@Override
	public List<Sculpture> getSculptureList() {
		return sculptureList;
	}

	@Override
	public void setSculptureList(List<Sculpture> sculptureList) {
		this.sculptureList = sculptureList;
	}

	@Override
	public boolean hasSculpture() {
		return sculptureList != null && sculptureList.size() > 0 && sculptureList.get(0) != null;
	}

	public LICENSE(SearchResultsPage searchResultsPage) {
		searchResultsPageList = new ArrayList<SearchResultsPage>();
		searchResultsPageList.add(searchResultsPage);
	}

	@Override
	public SearchResultsPage getSearchResultsPage() {
		if(searchResultsPageList != null && searchResultsPageList.size() > 0) {
			return searchResultsPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSearchResultsPage(SearchResultsPage searchResultsPage) {
		if(searchResultsPageList == null) {
			searchResultsPageList = new ArrayList<>();
		}
		if(searchResultsPageList.size() == 0) {
			searchResultsPageList.add(searchResultsPage);
		} else {
			searchResultsPageList.set(0, searchResultsPage);
		}
	}

	@Override
	public List<SearchResultsPage> getSearchResultsPageList() {
		return searchResultsPageList;
	}

	@Override
	public void setSearchResultsPageList(List<SearchResultsPage> searchResultsPageList) {
		this.searchResultsPageList = searchResultsPageList;
	}

	@Override
	public boolean hasSearchResultsPage() {
		return searchResultsPageList != null && searchResultsPageList.size() > 0 && searchResultsPageList.get(0) != null;
	}

	public LICENSE(SheetMusic sheetMusic) {
		sheetMusicList = new ArrayList<SheetMusic>();
		sheetMusicList.add(sheetMusic);
	}

	@Override
	public SheetMusic getSheetMusic() {
		if(sheetMusicList != null && sheetMusicList.size() > 0) {
			return sheetMusicList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSheetMusic(SheetMusic sheetMusic) {
		if(sheetMusicList == null) {
			sheetMusicList = new ArrayList<>();
		}
		if(sheetMusicList.size() == 0) {
			sheetMusicList.add(sheetMusic);
		} else {
			sheetMusicList.set(0, sheetMusic);
		}
	}

	@Override
	public List<SheetMusic> getSheetMusicList() {
		return sheetMusicList;
	}

	@Override
	public void setSheetMusicList(List<SheetMusic> sheetMusicList) {
		this.sheetMusicList = sheetMusicList;
	}

	@Override
	public boolean hasSheetMusic() {
		return sheetMusicList != null && sheetMusicList.size() > 0 && sheetMusicList.get(0) != null;
	}

	public LICENSE(ShortStory shortStory) {
		shortStoryList = new ArrayList<ShortStory>();
		shortStoryList.add(shortStory);
	}

	@Override
	public ShortStory getShortStory() {
		if(shortStoryList != null && shortStoryList.size() > 0) {
			return shortStoryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setShortStory(ShortStory shortStory) {
		if(shortStoryList == null) {
			shortStoryList = new ArrayList<>();
		}
		if(shortStoryList.size() == 0) {
			shortStoryList.add(shortStory);
		} else {
			shortStoryList.set(0, shortStory);
		}
	}

	@Override
	public List<ShortStory> getShortStoryList() {
		return shortStoryList;
	}

	@Override
	public void setShortStoryList(List<ShortStory> shortStoryList) {
		this.shortStoryList = shortStoryList;
	}

	@Override
	public boolean hasShortStory() {
		return shortStoryList != null && shortStoryList.size() > 0 && shortStoryList.get(0) != null;
	}

	public LICENSE(SiteNavigationElement siteNavigationElement) {
		siteNavigationElementList = new ArrayList<SiteNavigationElement>();
		siteNavigationElementList.add(siteNavigationElement);
	}

	@Override
	public SiteNavigationElement getSiteNavigationElement() {
		if(siteNavigationElementList != null && siteNavigationElementList.size() > 0) {
			return siteNavigationElementList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSiteNavigationElement(SiteNavigationElement siteNavigationElement) {
		if(siteNavigationElementList == null) {
			siteNavigationElementList = new ArrayList<>();
		}
		if(siteNavigationElementList.size() == 0) {
			siteNavigationElementList.add(siteNavigationElement);
		} else {
			siteNavigationElementList.set(0, siteNavigationElement);
		}
	}

	@Override
	public List<SiteNavigationElement> getSiteNavigationElementList() {
		return siteNavigationElementList;
	}

	@Override
	public void setSiteNavigationElementList(List<SiteNavigationElement> siteNavigationElementList) {
		this.siteNavigationElementList = siteNavigationElementList;
	}

	@Override
	public boolean hasSiteNavigationElement() {
		return siteNavigationElementList != null && siteNavigationElementList.size() > 0 && siteNavigationElementList.get(0) != null;
	}

	public LICENSE(SocialMediaPosting socialMediaPosting) {
		socialMediaPostingList = new ArrayList<SocialMediaPosting>();
		socialMediaPostingList.add(socialMediaPosting);
	}

	@Override
	public SocialMediaPosting getSocialMediaPosting() {
		if(socialMediaPostingList != null && socialMediaPostingList.size() > 0) {
			return socialMediaPostingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSocialMediaPosting(SocialMediaPosting socialMediaPosting) {
		if(socialMediaPostingList == null) {
			socialMediaPostingList = new ArrayList<>();
		}
		if(socialMediaPostingList.size() == 0) {
			socialMediaPostingList.add(socialMediaPosting);
		} else {
			socialMediaPostingList.set(0, socialMediaPosting);
		}
	}

	@Override
	public List<SocialMediaPosting> getSocialMediaPostingList() {
		return socialMediaPostingList;
	}

	@Override
	public void setSocialMediaPostingList(List<SocialMediaPosting> socialMediaPostingList) {
		this.socialMediaPostingList = socialMediaPostingList;
	}

	@Override
	public boolean hasSocialMediaPosting() {
		return socialMediaPostingList != null && socialMediaPostingList.size() > 0 && socialMediaPostingList.get(0) != null;
	}

	public LICENSE(SoftwareApplication softwareApplication) {
		softwareApplicationList = new ArrayList<SoftwareApplication>();
		softwareApplicationList.add(softwareApplication);
	}

	@Override
	public SoftwareApplication getSoftwareApplication() {
		if(softwareApplicationList != null && softwareApplicationList.size() > 0) {
			return softwareApplicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSoftwareApplication(SoftwareApplication softwareApplication) {
		if(softwareApplicationList == null) {
			softwareApplicationList = new ArrayList<>();
		}
		if(softwareApplicationList.size() == 0) {
			softwareApplicationList.add(softwareApplication);
		} else {
			softwareApplicationList.set(0, softwareApplication);
		}
	}

	@Override
	public List<SoftwareApplication> getSoftwareApplicationList() {
		return softwareApplicationList;
	}

	@Override
	public void setSoftwareApplicationList(List<SoftwareApplication> softwareApplicationList) {
		this.softwareApplicationList = softwareApplicationList;
	}

	@Override
	public boolean hasSoftwareApplication() {
		return softwareApplicationList != null && softwareApplicationList.size() > 0 && softwareApplicationList.get(0) != null;
	}

	public LICENSE(SoftwareSourceCode softwareSourceCode) {
		softwareSourceCodeList = new ArrayList<SoftwareSourceCode>();
		softwareSourceCodeList.add(softwareSourceCode);
	}

	@Override
	public SoftwareSourceCode getSoftwareSourceCode() {
		if(softwareSourceCodeList != null && softwareSourceCodeList.size() > 0) {
			return softwareSourceCodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSoftwareSourceCode(SoftwareSourceCode softwareSourceCode) {
		if(softwareSourceCodeList == null) {
			softwareSourceCodeList = new ArrayList<>();
		}
		if(softwareSourceCodeList.size() == 0) {
			softwareSourceCodeList.add(softwareSourceCode);
		} else {
			softwareSourceCodeList.set(0, softwareSourceCode);
		}
	}

	@Override
	public List<SoftwareSourceCode> getSoftwareSourceCodeList() {
		return softwareSourceCodeList;
	}

	@Override
	public void setSoftwareSourceCodeList(List<SoftwareSourceCode> softwareSourceCodeList) {
		this.softwareSourceCodeList = softwareSourceCodeList;
	}

	@Override
	public boolean hasSoftwareSourceCode() {
		return softwareSourceCodeList != null && softwareSourceCodeList.size() > 0 && softwareSourceCodeList.get(0) != null;
	}

	public LICENSE(SpreadsheetDigitalDocument spreadsheetDigitalDocument) {
		spreadsheetDigitalDocumentList = new ArrayList<SpreadsheetDigitalDocument>();
		spreadsheetDigitalDocumentList.add(spreadsheetDigitalDocument);
	}

	@Override
	public SpreadsheetDigitalDocument getSpreadsheetDigitalDocument() {
		if(spreadsheetDigitalDocumentList != null && spreadsheetDigitalDocumentList.size() > 0) {
			return spreadsheetDigitalDocumentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSpreadsheetDigitalDocument(SpreadsheetDigitalDocument spreadsheetDigitalDocument) {
		if(spreadsheetDigitalDocumentList == null) {
			spreadsheetDigitalDocumentList = new ArrayList<>();
		}
		if(spreadsheetDigitalDocumentList.size() == 0) {
			spreadsheetDigitalDocumentList.add(spreadsheetDigitalDocument);
		} else {
			spreadsheetDigitalDocumentList.set(0, spreadsheetDigitalDocument);
		}
	}

	@Override
	public List<SpreadsheetDigitalDocument> getSpreadsheetDigitalDocumentList() {
		return spreadsheetDigitalDocumentList;
	}

	@Override
	public void setSpreadsheetDigitalDocumentList(List<SpreadsheetDigitalDocument> spreadsheetDigitalDocumentList) {
		this.spreadsheetDigitalDocumentList = spreadsheetDigitalDocumentList;
	}

	@Override
	public boolean hasSpreadsheetDigitalDocument() {
		return spreadsheetDigitalDocumentList != null && spreadsheetDigitalDocumentList.size() > 0 && spreadsheetDigitalDocumentList.get(0) != null;
	}

	public LICENSE(TVClip tvClip) {
		tvClipList = new ArrayList<TVClip>();
		tvClipList.add(tvClip);
	}

	@Override
	public TVClip getTVClip() {
		if(tvClipList != null && tvClipList.size() > 0) {
			return tvClipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTVClip(TVClip tvClip) {
		if(tvClipList == null) {
			tvClipList = new ArrayList<>();
		}
		if(tvClipList.size() == 0) {
			tvClipList.add(tvClip);
		} else {
			tvClipList.set(0, tvClip);
		}
	}

	@Override
	public List<TVClip> getTVClipList() {
		return tvClipList;
	}

	@Override
	public void setTVClipList(List<TVClip> tvClipList) {
		this.tvClipList = tvClipList;
	}

	@Override
	public boolean hasTVClip() {
		return tvClipList != null && tvClipList.size() > 0 && tvClipList.get(0) != null;
	}

	public LICENSE(TVEpisode tvEpisode) {
		tvEpisodeList = new ArrayList<TVEpisode>();
		tvEpisodeList.add(tvEpisode);
	}

	@Override
	public TVEpisode getTVEpisode() {
		if(tvEpisodeList != null && tvEpisodeList.size() > 0) {
			return tvEpisodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTVEpisode(TVEpisode tvEpisode) {
		if(tvEpisodeList == null) {
			tvEpisodeList = new ArrayList<>();
		}
		if(tvEpisodeList.size() == 0) {
			tvEpisodeList.add(tvEpisode);
		} else {
			tvEpisodeList.set(0, tvEpisode);
		}
	}

	@Override
	public List<TVEpisode> getTVEpisodeList() {
		return tvEpisodeList;
	}

	@Override
	public void setTVEpisodeList(List<TVEpisode> tvEpisodeList) {
		this.tvEpisodeList = tvEpisodeList;
	}

	@Override
	public boolean hasTVEpisode() {
		return tvEpisodeList != null && tvEpisodeList.size() > 0 && tvEpisodeList.get(0) != null;
	}

	public LICENSE(TVSeason tvSeason) {
		tvSeasonList = new ArrayList<TVSeason>();
		tvSeasonList.add(tvSeason);
	}

	@Override
	public TVSeason getTVSeason() {
		if(tvSeasonList != null && tvSeasonList.size() > 0) {
			return tvSeasonList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTVSeason(TVSeason tvSeason) {
		if(tvSeasonList == null) {
			tvSeasonList = new ArrayList<>();
		}
		if(tvSeasonList.size() == 0) {
			tvSeasonList.add(tvSeason);
		} else {
			tvSeasonList.set(0, tvSeason);
		}
	}

	@Override
	public List<TVSeason> getTVSeasonList() {
		return tvSeasonList;
	}

	@Override
	public void setTVSeasonList(List<TVSeason> tvSeasonList) {
		this.tvSeasonList = tvSeasonList;
	}

	@Override
	public boolean hasTVSeason() {
		return tvSeasonList != null && tvSeasonList.size() > 0 && tvSeasonList.get(0) != null;
	}

	public LICENSE(TVSeries tvSeries) {
		tvSeriesList = new ArrayList<TVSeries>();
		tvSeriesList.add(tvSeries);
	}

	@Override
	public TVSeries getTVSeries() {
		if(tvSeriesList != null && tvSeriesList.size() > 0) {
			return tvSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTVSeries(TVSeries tvSeries) {
		if(tvSeriesList == null) {
			tvSeriesList = new ArrayList<>();
		}
		if(tvSeriesList.size() == 0) {
			tvSeriesList.add(tvSeries);
		} else {
			tvSeriesList.set(0, tvSeries);
		}
	}

	@Override
	public List<TVSeries> getTVSeriesList() {
		return tvSeriesList;
	}

	@Override
	public void setTVSeriesList(List<TVSeries> tvSeriesList) {
		this.tvSeriesList = tvSeriesList;
	}

	@Override
	public boolean hasTVSeries() {
		return tvSeriesList != null && tvSeriesList.size() > 0 && tvSeriesList.get(0) != null;
	}

	public LICENSE(Table table) {
		tableList = new ArrayList<Table>();
		tableList.add(table);
	}

	@Override
	public Table getTable() {
		if(tableList != null && tableList.size() > 0) {
			return tableList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTable(Table table) {
		if(tableList == null) {
			tableList = new ArrayList<>();
		}
		if(tableList.size() == 0) {
			tableList.add(table);
		} else {
			tableList.set(0, table);
		}
	}

	@Override
	public List<Table> getTableList() {
		return tableList;
	}

	@Override
	public void setTableList(List<Table> tableList) {
		this.tableList = tableList;
	}

	@Override
	public boolean hasTable() {
		return tableList != null && tableList.size() > 0 && tableList.get(0) != null;
	}

	public LICENSE(TechArticle techArticle) {
		techArticleList = new ArrayList<TechArticle>();
		techArticleList.add(techArticle);
	}

	@Override
	public TechArticle getTechArticle() {
		if(techArticleList != null && techArticleList.size() > 0) {
			return techArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTechArticle(TechArticle techArticle) {
		if(techArticleList == null) {
			techArticleList = new ArrayList<>();
		}
		if(techArticleList.size() == 0) {
			techArticleList.add(techArticle);
		} else {
			techArticleList.set(0, techArticle);
		}
	}

	@Override
	public List<TechArticle> getTechArticleList() {
		return techArticleList;
	}

	@Override
	public void setTechArticleList(List<TechArticle> techArticleList) {
		this.techArticleList = techArticleList;
	}

	@Override
	public boolean hasTechArticle() {
		return techArticleList != null && techArticleList.size() > 0 && techArticleList.get(0) != null;
	}

	public LICENSE(TextDigitalDocument textDigitalDocument) {
		textDigitalDocumentList = new ArrayList<TextDigitalDocument>();
		textDigitalDocumentList.add(textDigitalDocument);
	}

	@Override
	public TextDigitalDocument getTextDigitalDocument() {
		if(textDigitalDocumentList != null && textDigitalDocumentList.size() > 0) {
			return textDigitalDocumentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTextDigitalDocument(TextDigitalDocument textDigitalDocument) {
		if(textDigitalDocumentList == null) {
			textDigitalDocumentList = new ArrayList<>();
		}
		if(textDigitalDocumentList.size() == 0) {
			textDigitalDocumentList.add(textDigitalDocument);
		} else {
			textDigitalDocumentList.set(0, textDigitalDocument);
		}
	}

	@Override
	public List<TextDigitalDocument> getTextDigitalDocumentList() {
		return textDigitalDocumentList;
	}

	@Override
	public void setTextDigitalDocumentList(List<TextDigitalDocument> textDigitalDocumentList) {
		this.textDigitalDocumentList = textDigitalDocumentList;
	}

	@Override
	public boolean hasTextDigitalDocument() {
		return textDigitalDocumentList != null && textDigitalDocumentList.size() > 0 && textDigitalDocumentList.get(0) != null;
	}

	public LICENSE(Thesis thesis) {
		thesisList = new ArrayList<Thesis>();
		thesisList.add(thesis);
	}

	@Override
	public Thesis getThesis() {
		if(thesisList != null && thesisList.size() > 0) {
			return thesisList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setThesis(Thesis thesis) {
		if(thesisList == null) {
			thesisList = new ArrayList<>();
		}
		if(thesisList.size() == 0) {
			thesisList.add(thesis);
		} else {
			thesisList.set(0, thesis);
		}
	}

	@Override
	public List<Thesis> getThesisList() {
		return thesisList;
	}

	@Override
	public void setThesisList(List<Thesis> thesisList) {
		this.thesisList = thesisList;
	}

	@Override
	public boolean hasThesis() {
		return thesisList != null && thesisList.size() > 0 && thesisList.get(0) != null;
	}

	public LICENSE(ThreeDimensionalModel threeDimensionalModel) {
		threeDimensionalModelList = new ArrayList<ThreeDimensionalModel>();
		threeDimensionalModelList.add(threeDimensionalModel);
	}

	@Override
	public ThreeDimensionalModel getThreeDimensionalModel() {
		if(threeDimensionalModelList != null && threeDimensionalModelList.size() > 0) {
			return threeDimensionalModelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setThreeDimensionalModel(ThreeDimensionalModel threeDimensionalModel) {
		if(threeDimensionalModelList == null) {
			threeDimensionalModelList = new ArrayList<>();
		}
		if(threeDimensionalModelList.size() == 0) {
			threeDimensionalModelList.add(threeDimensionalModel);
		} else {
			threeDimensionalModelList.set(0, threeDimensionalModel);
		}
	}

	@Override
	public List<ThreeDimensionalModel> getThreeDimensionalModelList() {
		return threeDimensionalModelList;
	}

	@Override
	public void setThreeDimensionalModelList(List<ThreeDimensionalModel> threeDimensionalModelList) {
		this.threeDimensionalModelList = threeDimensionalModelList;
	}

	@Override
	public boolean hasThreeDimensionalModel() {
		return threeDimensionalModelList != null && threeDimensionalModelList.size() > 0 && threeDimensionalModelList.get(0) != null;
	}

	public LICENSE(URL url) {
		urlList = new ArrayList<URL>();
		urlList.add(url);
	}

	@Override
	public URL getURL() {
		if(urlList != null && urlList.size() > 0) {
			return urlList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setURL(URL url) {
		if(urlList == null) {
			urlList = new ArrayList<>();
		}
		if(urlList.size() == 0) {
			urlList.add(url);
		} else {
			urlList.set(0, url);
		}
	}

	@Override
	public List<URL> getURLList() {
		return urlList;
	}

	@Override
	public void setURLList(List<URL> urlList) {
		this.urlList = urlList;
	}

	@Override
	public boolean hasURL() {
		return urlList != null && urlList.size() > 0 && urlList.get(0) != null;
	}

	public LICENSE(UserReview userReview) {
		userReviewList = new ArrayList<UserReview>();
		userReviewList.add(userReview);
	}

	@Override
	public UserReview getUserReview() {
		if(userReviewList != null && userReviewList.size() > 0) {
			return userReviewList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setUserReview(UserReview userReview) {
		if(userReviewList == null) {
			userReviewList = new ArrayList<>();
		}
		if(userReviewList.size() == 0) {
			userReviewList.add(userReview);
		} else {
			userReviewList.set(0, userReview);
		}
	}

	@Override
	public List<UserReview> getUserReviewList() {
		return userReviewList;
	}

	@Override
	public void setUserReviewList(List<UserReview> userReviewList) {
		this.userReviewList = userReviewList;
	}

	@Override
	public boolean hasUserReview() {
		return userReviewList != null && userReviewList.size() > 0 && userReviewList.get(0) != null;
	}

	public LICENSE(VideoGallery videoGallery) {
		videoGalleryList = new ArrayList<VideoGallery>();
		videoGalleryList.add(videoGallery);
	}

	@Override
	public VideoGallery getVideoGallery() {
		if(videoGalleryList != null && videoGalleryList.size() > 0) {
			return videoGalleryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVideoGallery(VideoGallery videoGallery) {
		if(videoGalleryList == null) {
			videoGalleryList = new ArrayList<>();
		}
		if(videoGalleryList.size() == 0) {
			videoGalleryList.add(videoGallery);
		} else {
			videoGalleryList.set(0, videoGallery);
		}
	}

	@Override
	public List<VideoGallery> getVideoGalleryList() {
		return videoGalleryList;
	}

	@Override
	public void setVideoGalleryList(List<VideoGallery> videoGalleryList) {
		this.videoGalleryList = videoGalleryList;
	}

	@Override
	public boolean hasVideoGallery() {
		return videoGalleryList != null && videoGalleryList.size() > 0 && videoGalleryList.get(0) != null;
	}

	public LICENSE(VideoGame videoGame) {
		videoGameList = new ArrayList<VideoGame>();
		videoGameList.add(videoGame);
	}

	@Override
	public VideoGame getVideoGame() {
		if(videoGameList != null && videoGameList.size() > 0) {
			return videoGameList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVideoGame(VideoGame videoGame) {
		if(videoGameList == null) {
			videoGameList = new ArrayList<>();
		}
		if(videoGameList.size() == 0) {
			videoGameList.add(videoGame);
		} else {
			videoGameList.set(0, videoGame);
		}
	}

	@Override
	public List<VideoGame> getVideoGameList() {
		return videoGameList;
	}

	@Override
	public void setVideoGameList(List<VideoGame> videoGameList) {
		this.videoGameList = videoGameList;
	}

	@Override
	public boolean hasVideoGame() {
		return videoGameList != null && videoGameList.size() > 0 && videoGameList.get(0) != null;
	}

	public LICENSE(VideoGameClip videoGameClip) {
		videoGameClipList = new ArrayList<VideoGameClip>();
		videoGameClipList.add(videoGameClip);
	}

	@Override
	public VideoGameClip getVideoGameClip() {
		if(videoGameClipList != null && videoGameClipList.size() > 0) {
			return videoGameClipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVideoGameClip(VideoGameClip videoGameClip) {
		if(videoGameClipList == null) {
			videoGameClipList = new ArrayList<>();
		}
		if(videoGameClipList.size() == 0) {
			videoGameClipList.add(videoGameClip);
		} else {
			videoGameClipList.set(0, videoGameClip);
		}
	}

	@Override
	public List<VideoGameClip> getVideoGameClipList() {
		return videoGameClipList;
	}

	@Override
	public void setVideoGameClipList(List<VideoGameClip> videoGameClipList) {
		this.videoGameClipList = videoGameClipList;
	}

	@Override
	public boolean hasVideoGameClip() {
		return videoGameClipList != null && videoGameClipList.size() > 0 && videoGameClipList.get(0) != null;
	}

	public LICENSE(VideoGameSeries videoGameSeries) {
		videoGameSeriesList = new ArrayList<VideoGameSeries>();
		videoGameSeriesList.add(videoGameSeries);
	}

	@Override
	public VideoGameSeries getVideoGameSeries() {
		if(videoGameSeriesList != null && videoGameSeriesList.size() > 0) {
			return videoGameSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVideoGameSeries(VideoGameSeries videoGameSeries) {
		if(videoGameSeriesList == null) {
			videoGameSeriesList = new ArrayList<>();
		}
		if(videoGameSeriesList.size() == 0) {
			videoGameSeriesList.add(videoGameSeries);
		} else {
			videoGameSeriesList.set(0, videoGameSeries);
		}
	}

	@Override
	public List<VideoGameSeries> getVideoGameSeriesList() {
		return videoGameSeriesList;
	}

	@Override
	public void setVideoGameSeriesList(List<VideoGameSeries> videoGameSeriesList) {
		this.videoGameSeriesList = videoGameSeriesList;
	}

	@Override
	public boolean hasVideoGameSeries() {
		return videoGameSeriesList != null && videoGameSeriesList.size() > 0 && videoGameSeriesList.get(0) != null;
	}

	public LICENSE(VideoObject videoObject) {
		videoObjectList = new ArrayList<VideoObject>();
		videoObjectList.add(videoObject);
	}

	@Override
	public VideoObject getVideoObject() {
		if(videoObjectList != null && videoObjectList.size() > 0) {
			return videoObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVideoObject(VideoObject videoObject) {
		if(videoObjectList == null) {
			videoObjectList = new ArrayList<>();
		}
		if(videoObjectList.size() == 0) {
			videoObjectList.add(videoObject);
		} else {
			videoObjectList.set(0, videoObject);
		}
	}

	@Override
	public List<VideoObject> getVideoObjectList() {
		return videoObjectList;
	}

	@Override
	public void setVideoObjectList(List<VideoObject> videoObjectList) {
		this.videoObjectList = videoObjectList;
	}

	@Override
	public boolean hasVideoObject() {
		return videoObjectList != null && videoObjectList.size() > 0 && videoObjectList.get(0) != null;
	}

	public LICENSE(VisualArtwork visualArtwork) {
		visualArtworkList = new ArrayList<VisualArtwork>();
		visualArtworkList.add(visualArtwork);
	}

	@Override
	public VisualArtwork getVisualArtwork() {
		if(visualArtworkList != null && visualArtworkList.size() > 0) {
			return visualArtworkList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVisualArtwork(VisualArtwork visualArtwork) {
		if(visualArtworkList == null) {
			visualArtworkList = new ArrayList<>();
		}
		if(visualArtworkList.size() == 0) {
			visualArtworkList.add(visualArtwork);
		} else {
			visualArtworkList.set(0, visualArtwork);
		}
	}

	@Override
	public List<VisualArtwork> getVisualArtworkList() {
		return visualArtworkList;
	}

	@Override
	public void setVisualArtworkList(List<VisualArtwork> visualArtworkList) {
		this.visualArtworkList = visualArtworkList;
	}

	@Override
	public boolean hasVisualArtwork() {
		return visualArtworkList != null && visualArtworkList.size() > 0 && visualArtworkList.get(0) != null;
	}

	public LICENSE(WPAdBlock wpAdBlock) {
		wpAdBlockList = new ArrayList<WPAdBlock>();
		wpAdBlockList.add(wpAdBlock);
	}

	@Override
	public WPAdBlock getWPAdBlock() {
		if(wpAdBlockList != null && wpAdBlockList.size() > 0) {
			return wpAdBlockList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWPAdBlock(WPAdBlock wpAdBlock) {
		if(wpAdBlockList == null) {
			wpAdBlockList = new ArrayList<>();
		}
		if(wpAdBlockList.size() == 0) {
			wpAdBlockList.add(wpAdBlock);
		} else {
			wpAdBlockList.set(0, wpAdBlock);
		}
	}

	@Override
	public List<WPAdBlock> getWPAdBlockList() {
		return wpAdBlockList;
	}

	@Override
	public void setWPAdBlockList(List<WPAdBlock> wpAdBlockList) {
		this.wpAdBlockList = wpAdBlockList;
	}

	@Override
	public boolean hasWPAdBlock() {
		return wpAdBlockList != null && wpAdBlockList.size() > 0 && wpAdBlockList.get(0) != null;
	}

	public LICENSE(WPFooter wpFooter) {
		wpFooterList = new ArrayList<WPFooter>();
		wpFooterList.add(wpFooter);
	}

	@Override
	public WPFooter getWPFooter() {
		if(wpFooterList != null && wpFooterList.size() > 0) {
			return wpFooterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWPFooter(WPFooter wpFooter) {
		if(wpFooterList == null) {
			wpFooterList = new ArrayList<>();
		}
		if(wpFooterList.size() == 0) {
			wpFooterList.add(wpFooter);
		} else {
			wpFooterList.set(0, wpFooter);
		}
	}

	@Override
	public List<WPFooter> getWPFooterList() {
		return wpFooterList;
	}

	@Override
	public void setWPFooterList(List<WPFooter> wpFooterList) {
		this.wpFooterList = wpFooterList;
	}

	@Override
	public boolean hasWPFooter() {
		return wpFooterList != null && wpFooterList.size() > 0 && wpFooterList.get(0) != null;
	}

	public LICENSE(WPHeader wpHeader) {
		wpHeaderList = new ArrayList<WPHeader>();
		wpHeaderList.add(wpHeader);
	}

	@Override
	public WPHeader getWPHeader() {
		if(wpHeaderList != null && wpHeaderList.size() > 0) {
			return wpHeaderList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWPHeader(WPHeader wpHeader) {
		if(wpHeaderList == null) {
			wpHeaderList = new ArrayList<>();
		}
		if(wpHeaderList.size() == 0) {
			wpHeaderList.add(wpHeader);
		} else {
			wpHeaderList.set(0, wpHeader);
		}
	}

	@Override
	public List<WPHeader> getWPHeaderList() {
		return wpHeaderList;
	}

	@Override
	public void setWPHeaderList(List<WPHeader> wpHeaderList) {
		this.wpHeaderList = wpHeaderList;
	}

	@Override
	public boolean hasWPHeader() {
		return wpHeaderList != null && wpHeaderList.size() > 0 && wpHeaderList.get(0) != null;
	}

	public LICENSE(WPSideBar wpSideBar) {
		wpSideBarList = new ArrayList<WPSideBar>();
		wpSideBarList.add(wpSideBar);
	}

	@Override
	public WPSideBar getWPSideBar() {
		if(wpSideBarList != null && wpSideBarList.size() > 0) {
			return wpSideBarList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWPSideBar(WPSideBar wpSideBar) {
		if(wpSideBarList == null) {
			wpSideBarList = new ArrayList<>();
		}
		if(wpSideBarList.size() == 0) {
			wpSideBarList.add(wpSideBar);
		} else {
			wpSideBarList.set(0, wpSideBar);
		}
	}

	@Override
	public List<WPSideBar> getWPSideBarList() {
		return wpSideBarList;
	}

	@Override
	public void setWPSideBarList(List<WPSideBar> wpSideBarList) {
		this.wpSideBarList = wpSideBarList;
	}

	@Override
	public boolean hasWPSideBar() {
		return wpSideBarList != null && wpSideBarList.size() > 0 && wpSideBarList.get(0) != null;
	}

	public LICENSE(WebApplication webApplication) {
		webApplicationList = new ArrayList<WebApplication>();
		webApplicationList.add(webApplication);
	}

	@Override
	public WebApplication getWebApplication() {
		if(webApplicationList != null && webApplicationList.size() > 0) {
			return webApplicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebApplication(WebApplication webApplication) {
		if(webApplicationList == null) {
			webApplicationList = new ArrayList<>();
		}
		if(webApplicationList.size() == 0) {
			webApplicationList.add(webApplication);
		} else {
			webApplicationList.set(0, webApplication);
		}
	}

	@Override
	public List<WebApplication> getWebApplicationList() {
		return webApplicationList;
	}

	@Override
	public void setWebApplicationList(List<WebApplication> webApplicationList) {
		this.webApplicationList = webApplicationList;
	}

	@Override
	public boolean hasWebApplication() {
		return webApplicationList != null && webApplicationList.size() > 0 && webApplicationList.get(0) != null;
	}

	public LICENSE(WebPage webPage) {
		webPageList = new ArrayList<WebPage>();
		webPageList.add(webPage);
	}

	@Override
	public WebPage getWebPage() {
		if(webPageList != null && webPageList.size() > 0) {
			return webPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebPage(WebPage webPage) {
		if(webPageList == null) {
			webPageList = new ArrayList<>();
		}
		if(webPageList.size() == 0) {
			webPageList.add(webPage);
		} else {
			webPageList.set(0, webPage);
		}
	}

	@Override
	public List<WebPage> getWebPageList() {
		return webPageList;
	}

	@Override
	public void setWebPageList(List<WebPage> webPageList) {
		this.webPageList = webPageList;
	}

	@Override
	public boolean hasWebPage() {
		return webPageList != null && webPageList.size() > 0 && webPageList.get(0) != null;
	}

	public LICENSE(WebPageElement webPageElement) {
		webPageElementList = new ArrayList<WebPageElement>();
		webPageElementList.add(webPageElement);
	}

	@Override
	public WebPageElement getWebPageElement() {
		if(webPageElementList != null && webPageElementList.size() > 0) {
			return webPageElementList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebPageElement(WebPageElement webPageElement) {
		if(webPageElementList == null) {
			webPageElementList = new ArrayList<>();
		}
		if(webPageElementList.size() == 0) {
			webPageElementList.add(webPageElement);
		} else {
			webPageElementList.set(0, webPageElement);
		}
	}

	@Override
	public List<WebPageElement> getWebPageElementList() {
		return webPageElementList;
	}

	@Override
	public void setWebPageElementList(List<WebPageElement> webPageElementList) {
		this.webPageElementList = webPageElementList;
	}

	@Override
	public boolean hasWebPageElement() {
		return webPageElementList != null && webPageElementList.size() > 0 && webPageElementList.get(0) != null;
	}

	public LICENSE(WebSite webSite) {
		webSiteList = new ArrayList<WebSite>();
		webSiteList.add(webSite);
	}

	@Override
	public WebSite getWebSite() {
		if(webSiteList != null && webSiteList.size() > 0) {
			return webSiteList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebSite(WebSite webSite) {
		if(webSiteList == null) {
			webSiteList = new ArrayList<>();
		}
		if(webSiteList.size() == 0) {
			webSiteList.add(webSite);
		} else {
			webSiteList.set(0, webSite);
		}
	}

	@Override
	public List<WebSite> getWebSiteList() {
		return webSiteList;
	}

	@Override
	public void setWebSiteList(List<WebSite> webSiteList) {
		this.webSiteList = webSiteList;
	}

	@Override
	public boolean hasWebSite() {
		return webSiteList != null && webSiteList.size() > 0 && webSiteList.get(0) != null;
	}

	public void copy(Container.License org) {
		setAPIReferenceList(org.getAPIReferenceList());
		setAboutPageList(org.getAboutPageList());
		setAdvertiserContentArticleList(org.getAdvertiserContentArticleList());
		setAnalysisNewsArticleList(org.getAnalysisNewsArticleList());
		setAnswerList(org.getAnswerList());
		setArchiveComponentList(org.getArchiveComponentList());
		setArticleList(org.getArticleList());
		setAskPublicNewsArticleList(org.getAskPublicNewsArticleList());
		setAtlasList(org.getAtlasList());
		setAudioObjectList(org.getAudioObjectList());
		setAudiobookList(org.getAudiobookList());
		setBackgroundNewsArticleList(org.getBackgroundNewsArticleList());
		setBarcodeList(org.getBarcodeList());
		setBlogList(org.getBlogList());
		setBlogPostingList(org.getBlogPostingList());
		setBookList(org.getBookList());
		setBookSeriesList(org.getBookSeriesList());
		setCategoryCodeSetList(org.getCategoryCodeSetList());
		setChapterList(org.getChapterList());
		setCheckoutPageList(org.getCheckoutPageList());
		setClaimList(org.getClaimList());
		setClaimReviewList(org.getClaimReviewList());
		setClipList(org.getClipList());
		setCollectionList(org.getCollectionList());
		setCollectionPageList(org.getCollectionPageList());
		setComicCoverArtList(org.getComicCoverArtList());
		setComicIssueList(org.getComicIssueList());
		setComicSeriesList(org.getComicSeriesList());
		setComicStoryList(org.getComicStoryList());
		setCommentList(org.getCommentList());
		setCompleteDataFeedList(org.getCompleteDataFeedList());
		setContactPageList(org.getContactPageList());
		setConversationList(org.getConversationList());
		setCorrectionCommentList(org.getCorrectionCommentList());
		setCourseList(org.getCourseList());
		setCoverArtList(org.getCoverArtList());
		setCreativeWorkList(org.getCreativeWorkList());
		setCreativeWorkSeasonList(org.getCreativeWorkSeasonList());
		setCreativeWorkSeriesList(org.getCreativeWorkSeriesList());
		setCriticReviewList(org.getCriticReviewList());
		setDataCatalogList(org.getDataCatalogList());
		setDataDownloadList(org.getDataDownloadList());
		setDataFeedList(org.getDataFeedList());
		setDatasetList(org.getDatasetList());
		setDefinedTermSetList(org.getDefinedTermSetList());
		setDietList(org.getDietList());
		setDigitalDocumentList(org.getDigitalDocumentList());
		setDiscussionForumPostingList(org.getDiscussionForumPostingList());
		setDrawingList(org.getDrawingList());
		setEducationalOccupationalCredentialList(org.getEducationalOccupationalCredentialList());
		setEmailMessageList(org.getEmailMessageList());
		setEmployerReviewList(org.getEmployerReviewList());
		setEpisodeList(org.getEpisodeList());
		setExercisePlanList(org.getExercisePlanList());
		setFAQPageList(org.getFAQPageList());
		setGameList(org.getGameList());
		setHowToList(org.getHowToList());
		setHowToDirectionList(org.getHowToDirectionList());
		setHowToSectionList(org.getHowToSectionList());
		setHowToStepList(org.getHowToStepList());
		setHowToTipList(org.getHowToTipList());
		setImageGalleryList(org.getImageGalleryList());
		setImageObjectList(org.getImageObjectList());
		setItemPageList(org.getItemPageList());
		setLegislationList(org.getLegislationList());
		setLegislationObjectList(org.getLegislationObjectList());
		setLiveBlogPostingList(org.getLiveBlogPostingList());
		setManuscriptList(org.getManuscriptList());
		setMapList(org.getMapList());
		setMediaObjectList(org.getMediaObjectList());
		setMedicalScholarlyArticleList(org.getMedicalScholarlyArticleList());
		setMedicalWebPageList(org.getMedicalWebPageList());
		setMenuList(org.getMenuList());
		setMenuSectionList(org.getMenuSectionList());
		setMessageList(org.getMessageList());
		setMobileApplicationList(org.getMobileApplicationList());
		setMovieList(org.getMovieList());
		setMovieClipList(org.getMovieClipList());
		setMovieSeriesList(org.getMovieSeriesList());
		setMusicAlbumList(org.getMusicAlbumList());
		setMusicCompositionList(org.getMusicCompositionList());
		setMusicPlaylistList(org.getMusicPlaylistList());
		setMusicRecordingList(org.getMusicRecordingList());
		setMusicReleaseList(org.getMusicReleaseList());
		setMusicVideoObjectList(org.getMusicVideoObjectList());
		setNewsArticleList(org.getNewsArticleList());
		setNewspaperList(org.getNewspaperList());
		setNoteDigitalDocumentList(org.getNoteDigitalDocumentList());
		setOpinionNewsArticleList(org.getOpinionNewsArticleList());
		setPaintingList(org.getPaintingList());
		setPeriodicalList(org.getPeriodicalList());
		setPhotographList(org.getPhotographList());
		setPlayList(org.getPlayList());
		setPosterList(org.getPosterList());
		setPresentationDigitalDocumentList(org.getPresentationDigitalDocumentList());
		setProfilePageList(org.getProfilePageList());
		setPublicationIssueList(org.getPublicationIssueList());
		setPublicationVolumeList(org.getPublicationVolumeList());
		setQAPageList(org.getQAPageList());
		setQuestionList(org.getQuestionList());
		setQuotationList(org.getQuotationList());
		setRadioClipList(org.getRadioClipList());
		setRadioEpisodeList(org.getRadioEpisodeList());
		setRadioSeasonList(org.getRadioSeasonList());
		setRadioSeriesList(org.getRadioSeriesList());
		setRecipeList(org.getRecipeList());
		setReportList(org.getReportList());
		setReportageNewsArticleList(org.getReportageNewsArticleList());
		setReviewList(org.getReviewList());
		setReviewNewsArticleList(org.getReviewNewsArticleList());
		setSatiricalArticleList(org.getSatiricalArticleList());
		setScholarlyArticleList(org.getScholarlyArticleList());
		setSculptureList(org.getSculptureList());
		setSearchResultsPageList(org.getSearchResultsPageList());
		setSheetMusicList(org.getSheetMusicList());
		setShortStoryList(org.getShortStoryList());
		setSiteNavigationElementList(org.getSiteNavigationElementList());
		setSocialMediaPostingList(org.getSocialMediaPostingList());
		setSoftwareApplicationList(org.getSoftwareApplicationList());
		setSoftwareSourceCodeList(org.getSoftwareSourceCodeList());
		setSpreadsheetDigitalDocumentList(org.getSpreadsheetDigitalDocumentList());
		setTVClipList(org.getTVClipList());
		setTVEpisodeList(org.getTVEpisodeList());
		setTVSeasonList(org.getTVSeasonList());
		setTVSeriesList(org.getTVSeriesList());
		setTableList(org.getTableList());
		setTechArticleList(org.getTechArticleList());
		setTextDigitalDocumentList(org.getTextDigitalDocumentList());
		setThesisList(org.getThesisList());
		setThreeDimensionalModelList(org.getThreeDimensionalModelList());
		setURLList(org.getURLList());
		setUserReviewList(org.getUserReviewList());
		setVideoGalleryList(org.getVideoGalleryList());
		setVideoGameList(org.getVideoGameList());
		setVideoGameClipList(org.getVideoGameClipList());
		setVideoGameSeriesList(org.getVideoGameSeriesList());
		setVideoObjectList(org.getVideoObjectList());
		setVisualArtworkList(org.getVisualArtworkList());
		setWPAdBlockList(org.getWPAdBlockList());
		setWPFooterList(org.getWPFooterList());
		setWPHeaderList(org.getWPHeaderList());
		setWPSideBarList(org.getWPSideBarList());
		setWebApplicationList(org.getWebApplicationList());
		setWebPageList(org.getWebPageList());
		setWebPageElementList(org.getWebPageElementList());
		setWebSiteList(org.getWebSiteList());
	}

	@Override
	public String getNativeValue() {
		if(getURL() == null) return null;
		return getURL().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
