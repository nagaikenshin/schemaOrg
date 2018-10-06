package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Atlas;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Audiobook;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Chapter;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Collection;
import org.kyojo.schemaorg.m3n4.bib.Clazz.ComicCoverArt;
import org.kyojo.schemaorg.m3n4.bib.Clazz.ComicIssue;
import org.kyojo.schemaorg.m3n4.bib.Clazz.ComicSeries;
import org.kyojo.schemaorg.m3n4.bib.Clazz.ComicStory;
import org.kyojo.schemaorg.m3n4.bib.Clazz.CoverArt;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Newspaper;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Thesis;
import org.kyojo.schemaorg.m3n4.bib.Container.PublisherImprint;
import org.kyojo.schemaorg.m3n4.bib.Container.TranslationOfWork;
import org.kyojo.schemaorg.m3n4.bib.Container.WorkTranslation;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Clazz.APIReference;
import org.kyojo.schemaorg.m3n4.core.Clazz.AboutPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.Answer;
import org.kyojo.schemaorg.m3n4.core.Clazz.Article;
import org.kyojo.schemaorg.m3n4.core.Clazz.AudioObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.Barcode;
import org.kyojo.schemaorg.m3n4.core.Clazz.Blog;
import org.kyojo.schemaorg.m3n4.core.Clazz.BlogPosting;
import org.kyojo.schemaorg.m3n4.core.Clazz.Book;
import org.kyojo.schemaorg.m3n4.core.Clazz.BookSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusTrip;
import org.kyojo.schemaorg.m3n4.core.Clazz.CheckoutPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.ClaimReview;
import org.kyojo.schemaorg.m3n4.core.Clazz.Clip;
import org.kyojo.schemaorg.m3n4.core.Clazz.CollectionPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.ContactPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.Conversation;
import org.kyojo.schemaorg.m3n4.core.Clazz.Course;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWorkSeason;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWorkSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataCatalog;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataDownload;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataFeed;
import org.kyojo.schemaorg.m3n4.core.Clazz.Dataset;
import org.kyojo.schemaorg.m3n4.core.Clazz.DigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.DiscussionForumPosting;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmailMessage;
import org.kyojo.schemaorg.m3n4.core.Clazz.Flight;
import org.kyojo.schemaorg.m3n4.core.Clazz.Game;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowTo;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToDirection;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToSection;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToStep;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToTip;
import org.kyojo.schemaorg.m3n4.core.Clazz.ImageGallery;
import org.kyojo.schemaorg.m3n4.core.Clazz.ImageObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.ItemPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.LiveBlogPosting;
import org.kyojo.schemaorg.m3n4.core.Clazz.Map;
import org.kyojo.schemaorg.m3n4.core.Clazz.MediaObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.Menu;
import org.kyojo.schemaorg.m3n4.core.Clazz.MenuSection;
import org.kyojo.schemaorg.m3n4.core.Clazz.Message;
import org.kyojo.schemaorg.m3n4.core.Clazz.MobileApplication;
import org.kyojo.schemaorg.m3n4.core.Clazz.Movie;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieClip;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicAlbum;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicComposition;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicPlaylist;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicRecording;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicRelease;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicVideoObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.NewsArticle;
import org.kyojo.schemaorg.m3n4.core.Clazz.NoteDigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.Painting;
import org.kyojo.schemaorg.m3n4.core.Clazz.Periodical;
import org.kyojo.schemaorg.m3n4.core.Clazz.Photograph;
import org.kyojo.schemaorg.m3n4.core.Clazz.PresentationDigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProfilePage;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicationIssue;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicationVolume;
import org.kyojo.schemaorg.m3n4.core.Clazz.QAPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.Question;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioClip;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioEpisode;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioSeason;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.Recipe;
import org.kyojo.schemaorg.m3n4.core.Clazz.Report;
import org.kyojo.schemaorg.m3n4.core.Clazz.ScholarlyArticle;
import org.kyojo.schemaorg.m3n4.core.Clazz.Sculpture;
import org.kyojo.schemaorg.m3n4.core.Clazz.SearchResultsPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.SiteNavigationElement;
import org.kyojo.schemaorg.m3n4.core.Clazz.SocialMediaPosting;
import org.kyojo.schemaorg.m3n4.core.Clazz.SoftwareApplication;
import org.kyojo.schemaorg.m3n4.core.Clazz.SoftwareSourceCode;
import org.kyojo.schemaorg.m3n4.core.Clazz.SpreadsheetDigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.TVClip;
import org.kyojo.schemaorg.m3n4.core.Clazz.TVEpisode;
import org.kyojo.schemaorg.m3n4.core.Clazz.TVSeason;
import org.kyojo.schemaorg.m3n4.core.Clazz.TVSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.Table;
import org.kyojo.schemaorg.m3n4.core.Clazz.TechArticle;
import org.kyojo.schemaorg.m3n4.core.Clazz.TextDigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.TrainTrip;
import org.kyojo.schemaorg.m3n4.core.Clazz.Trip;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGallery;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGame;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGameClip;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGameSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.VisualArtwork;
import org.kyojo.schemaorg.m3n4.core.Clazz.WPAdBlock;
import org.kyojo.schemaorg.m3n4.core.Clazz.WPFooter;
import org.kyojo.schemaorg.m3n4.core.Clazz.WPHeader;
import org.kyojo.schemaorg.m3n4.core.Clazz.WPSideBar;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebApplication;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebPageElement;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebSite;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.About;
import org.kyojo.schemaorg.m3n4.core.Container.AccessMode;
import org.kyojo.schemaorg.m3n4.core.Container.AccessModeSufficient;
import org.kyojo.schemaorg.m3n4.core.Container.AccessibilityAPI;
import org.kyojo.schemaorg.m3n4.core.Container.AccessibilityControl;
import org.kyojo.schemaorg.m3n4.core.Container.AccessibilityFeature;
import org.kyojo.schemaorg.m3n4.core.Container.AccessibilityHazard;
import org.kyojo.schemaorg.m3n4.core.Container.AccessibilitySummary;
import org.kyojo.schemaorg.m3n4.core.Container.AccountablePerson;
import org.kyojo.schemaorg.m3n4.core.Container.Actor;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AggregateRating;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.AlternativeHeadline;
import org.kyojo.schemaorg.m3n4.core.Container.AssociatedMedia;
import org.kyojo.schemaorg.m3n4.core.Container.Audience;
import org.kyojo.schemaorg.m3n4.core.Container.Audio;
import org.kyojo.schemaorg.m3n4.core.Container.Author;
import org.kyojo.schemaorg.m3n4.core.Container.Award;
import org.kyojo.schemaorg.m3n4.core.Container.Character;
import org.kyojo.schemaorg.m3n4.core.Container.Citation;
import org.kyojo.schemaorg.m3n4.core.Container.CommentCount;
import org.kyojo.schemaorg.m3n4.core.Container.ContentLocation;
import org.kyojo.schemaorg.m3n4.core.Container.ContentRating;
import org.kyojo.schemaorg.m3n4.core.Container.Contributor;
import org.kyojo.schemaorg.m3n4.core.Container.CopyrightHolder;
import org.kyojo.schemaorg.m3n4.core.Container.CopyrightYear;
import org.kyojo.schemaorg.m3n4.core.Container.Creator;
import org.kyojo.schemaorg.m3n4.core.Container.DateCreated;
import org.kyojo.schemaorg.m3n4.core.Container.DateModified;
import org.kyojo.schemaorg.m3n4.core.Container.DatePublished;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.Director;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.DiscussionUrl;
import org.kyojo.schemaorg.m3n4.core.Container.Editor;
import org.kyojo.schemaorg.m3n4.core.Container.EducationalAlignment;
import org.kyojo.schemaorg.m3n4.core.Container.EducationalUse;
import org.kyojo.schemaorg.m3n4.core.Container.Encoding;
import org.kyojo.schemaorg.m3n4.core.Container.EncodingFormat;
import org.kyojo.schemaorg.m3n4.core.Container.EpisodeNumber;
import org.kyojo.schemaorg.m3n4.core.Container.ExampleOfWork;
import org.kyojo.schemaorg.m3n4.core.Container.Expires;
import org.kyojo.schemaorg.m3n4.core.Container.Funder;
import org.kyojo.schemaorg.m3n4.core.Container.Genre;
import org.kyojo.schemaorg.m3n4.core.Container.HasPart;
import org.kyojo.schemaorg.m3n4.core.Container.Headline;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.InLanguage;
import org.kyojo.schemaorg.m3n4.core.Container.InteractionStatistic;
import org.kyojo.schemaorg.m3n4.core.Container.InteractivityType;
import org.kyojo.schemaorg.m3n4.core.Container.IsAccessibleForFree;
import org.kyojo.schemaorg.m3n4.core.Container.IsBasedOn;
import org.kyojo.schemaorg.m3n4.core.Container.IsFamilyFriendly;
import org.kyojo.schemaorg.m3n4.core.Container.IsPartOf;
import org.kyojo.schemaorg.m3n4.core.Container.Keywords;
import org.kyojo.schemaorg.m3n4.core.Container.LearningResourceType;
import org.kyojo.schemaorg.m3n4.core.Container.License;
import org.kyojo.schemaorg.m3n4.core.Container.LocationCreated;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntity;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.Material;
import org.kyojo.schemaorg.m3n4.core.Container.Mentions;
import org.kyojo.schemaorg.m3n4.core.Container.MusicBy;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.Offers;
import org.kyojo.schemaorg.m3n4.core.Container.PartOfSeason;
import org.kyojo.schemaorg.m3n4.core.Container.PartOfSeries;
import org.kyojo.schemaorg.m3n4.core.Container.Position;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.Producer;
import org.kyojo.schemaorg.m3n4.core.Container.ProductionCompany;
import org.kyojo.schemaorg.m3n4.core.Container.Provider;
import org.kyojo.schemaorg.m3n4.core.Container.Publication;
import org.kyojo.schemaorg.m3n4.core.Container.Publisher;
import org.kyojo.schemaorg.m3n4.core.Container.PublishingPrinciples;
import org.kyojo.schemaorg.m3n4.core.Container.RecordedAt;
import org.kyojo.schemaorg.m3n4.core.Container.ReleasedEvent;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.SchemaVersion;
import org.kyojo.schemaorg.m3n4.core.Container.SourceOrganization;
import org.kyojo.schemaorg.m3n4.core.Container.SpatialCoverage;
import org.kyojo.schemaorg.m3n4.core.Container.Sponsor;
import org.kyojo.schemaorg.m3n4.core.Container.TemporalCoverage;
import org.kyojo.schemaorg.m3n4.core.Container.Text;
import org.kyojo.schemaorg.m3n4.core.Container.ThumbnailUrl;
import org.kyojo.schemaorg.m3n4.core.Container.TimeRequired;
import org.kyojo.schemaorg.m3n4.core.Container.Trailer;
import org.kyojo.schemaorg.m3n4.core.Container.Translator;
import org.kyojo.schemaorg.m3n4.core.Container.TypicalAgeRange;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.Container.Version;
import org.kyojo.schemaorg.m3n4.core.Container.Video;
import org.kyojo.schemaorg.m3n4.core.Container.WorkExample;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.COMMENT;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.REVIEW;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Diet;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ExercisePlan;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalScholarlyArticle;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalWebPage;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AdvertiserContentArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AnalysisNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AskPublicNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.BackgroundNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CategoryCodeSet;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Claim;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CompleteDataFeed;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CorrectionComment;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CriticReview;
import org.kyojo.schemaorg.m3n4.pending.Clazz.DefinedTermSet;
import org.kyojo.schemaorg.m3n4.pending.Clazz.EmployerReview;
import org.kyojo.schemaorg.m3n4.pending.Clazz.FAQPage;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Legislation;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LegislationObject;
import org.kyojo.schemaorg.m3n4.pending.Clazz.OpinionNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Quotation;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ReportageNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ReviewNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.SatiricalArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.TouristTrip;
import org.kyojo.schemaorg.m3n4.pending.Clazz.UserReview;
import org.kyojo.schemaorg.m3n4.pending.Container.ContentReferenceTime;
import org.kyojo.schemaorg.m3n4.pending.Container.Correction;
import org.kyojo.schemaorg.m3n4.pending.Container.SdDatePublished;
import org.kyojo.schemaorg.m3n4.pending.Container.SdLicense;
import org.kyojo.schemaorg.m3n4.pending.Container.SdPublisher;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;

public class EPISODE implements Clazz.Episode, Container.Episode {

	private static final long serialVersionUID = 1L;

	public Long seq;
	public Long refSeq;
	public String refAcr;
	public java.util.Date createdAt;
	public Long createdBy;
	public java.util.Date updatedAt;
	public Long updatedBy;
	public java.util.Date expiredAt;
	public Long expiredBy;
	public List<APIReference> apiReferenceList;
	public About about;
	public List<AboutPage> aboutPageList;
	public AccessMode accessMode;
	public AccessModeSufficient accessModeSufficient;
	public AccessibilityAPI accessibilityAPI;
	public AccessibilityControl accessibilityControl;
	public AccessibilityFeature accessibilityFeature;
	public AccessibilityHazard accessibilityHazard;
	public AccessibilitySummary accessibilitySummary;
	public AccountablePerson accountablePerson;
	public Actor actor;
	public AdditionalType additionalType;
	public List<AdvertiserContentArticle> advertiserContentArticleList;
	public AggregateRating aggregateRating;
	public AlternateName alternateName;
	public AlternativeHeadline alternativeHeadline;
	public List<AnalysisNewsArticle> analysisNewsArticleList;
	public List<Answer> answerList;
	public List<Article> articleList;
	public List<AskPublicNewsArticle> askPublicNewsArticleList;
	public AssociatedMedia associatedMedia;
	public List<Atlas> atlasList;
	public Audience audience;
	public Audio audio;
	public List<AudioObject> audioObjectList;
	public List<Audiobook> audiobookList;
	public Author author;
	public Award award;
	public List<BackgroundNewsArticle> backgroundNewsArticleList;
	public List<Barcode> barcodeList;
	public List<Blog> blogList;
	public List<BlogPosting> blogPostingList;
	public List<Book> bookList;
	public List<BookSeries> bookSeriesList;
	public List<BusTrip> busTripList;
	public List<CategoryCodeSet> categoryCodeSetList;
	public List<Chapter> chapterList;
	public Character character;
	public List<CheckoutPage> checkoutPageList;
	public Citation citation;
	public List<Claim> claimList;
	public List<ClaimReview> claimReviewList;
	public List<Clip> clipList;
	public List<Collection> collectionList;
	public List<CollectionPage> collectionPageList;
	public List<ComicCoverArt> comicCoverArtList;
	public List<ComicIssue> comicIssueList;
	public List<ComicSeries> comicSeriesList;
	public List<ComicStory> comicStoryList;
	public Container.Comment comment;
	public List<Clazz.Comment> commentList;
	public CommentCount commentCount;
	public List<CompleteDataFeed> completeDataFeedList;
	public List<ContactPage> contactPageList;
	public ContentLocation contentLocation;
	public ContentRating contentRating;
	public ContentReferenceTime contentReferenceTime;
	public Contributor contributor;
	public List<Conversation> conversationList;
	public CopyrightHolder copyrightHolder;
	public CopyrightYear copyrightYear;
	public Correction correction;
	public List<CorrectionComment> correctionCommentList;
	public List<Course> courseList;
	public List<CoverArt> coverArtList;
	public List<CreativeWork> creativeWorkList;
	public List<CreativeWorkSeason> creativeWorkSeasonList;
	public List<CreativeWorkSeries> creativeWorkSeriesList;
	public Creator creator;
	public List<CriticReview> criticReviewList;
	public List<DataCatalog> dataCatalogList;
	public List<DataDownload> dataDownloadList;
	public List<DataFeed> dataFeedList;
	public List<Dataset> datasetList;
	public DateCreated dateCreated;
	public DateModified dateModified;
	public DatePublished datePublished;
	public List<DefinedTermSet> definedTermSetList;
	public Description description;
	public List<Diet> dietList;
	public List<DigitalDocument> digitalDocumentList;
	public Director director;
	public DisambiguatingDescription disambiguatingDescription;
	public List<DiscussionForumPosting> discussionForumPostingList;
	public DiscussionUrl discussionUrl;
	public Editor editor;
	public EducationalAlignment educationalAlignment;
	public EducationalUse educationalUse;
	public List<EmailMessage> emailMessageList;
	public List<EmployerReview> employerReviewList;
	public Encoding encoding;
	public EncodingFormat encodingFormat;
	public List<Clazz.Episode> episodeList;
	public EpisodeNumber episodeNumber;
	public ExampleOfWork exampleOfWork;
	public List<ExercisePlan> exercisePlanList;
	public Expires expires;
	public List<FAQPage> faqPageList;
	public List<Flight> flightList;
	public Funder funder;
	public List<Game> gameList;
	public Genre genre;
	public HasPart hasPart;
	public Headline headline;
	public List<HowTo> howToList;
	public List<HowToDirection> howToDirectionList;
	public List<HowToSection> howToSectionList;
	public List<HowToStep> howToStepList;
	public List<HowToTip> howToTipList;
	public Identifier identifier;
	public Image image;
	public List<ImageGallery> imageGalleryList;
	public List<ImageObject> imageObjectList;
	public InLanguage inLanguage;
	public InteractionStatistic interactionStatistic;
	public InteractivityType interactivityType;
	public IsAccessibleForFree isAccessibleForFree;
	public IsBasedOn isBasedOn;
	public IsFamilyFriendly isFamilyFriendly;
	public IsPartOf isPartOf;
	public List<ItemPage> itemPageList;
	public Keywords keywords;
	public LearningResourceType learningResourceType;
	public List<Legislation> legislationList;
	public List<LegislationObject> legislationObjectList;
	public License license;
	public List<LiveBlogPosting> liveBlogPostingList;
	public LocationCreated locationCreated;
	public MainEntity mainEntity;
	public MainEntityOfPage mainEntityOfPage;
	public List<Map> mapList;
	public Material material;
	public List<MediaObject> mediaObjectList;
	public List<MedicalScholarlyArticle> medicalScholarlyArticleList;
	public List<MedicalWebPage> medicalWebPageList;
	public Mentions mentions;
	public List<Menu> menuList;
	public List<MenuSection> menuSectionList;
	public List<Message> messageList;
	public List<MobileApplication> mobileApplicationList;
	public List<Movie> movieList;
	public List<MovieClip> movieClipList;
	public List<MovieSeries> movieSeriesList;
	public List<MusicAlbum> musicAlbumList;
	public MusicBy musicBy;
	public List<MusicComposition> musicCompositionList;
	public List<MusicPlaylist> musicPlaylistList;
	public List<MusicRecording> musicRecordingList;
	public List<MusicRelease> musicReleaseList;
	public List<MusicVideoObject> musicVideoObjectList;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public List<NewsArticle> newsArticleList;
	public List<Newspaper> newspaperList;
	public List<NoteDigitalDocument> noteDigitalDocumentList;
	public Offers offers;
	public List<OpinionNewsArticle> opinionNewsArticleList;
	public List<Painting> paintingList;
	public PartOfSeason partOfSeason;
	public PartOfSeries partOfSeries;
	public List<Periodical> periodicalList;
	public List<Photograph> photographList;
	public Position position;
	public PotentialAction potentialAction;
	public List<PresentationDigitalDocument> presentationDigitalDocumentList;
	public Producer producer;
	public ProductionCompany productionCompany;
	public List<ProfilePage> profilePageList;
	public Provider provider;
	public Publication publication;
	public List<PublicationIssue> publicationIssueList;
	public List<PublicationVolume> publicationVolumeList;
	public Publisher publisher;
	public PublisherImprint publisherImprint;
	public PublishingPrinciples publishingPrinciples;
	public List<QAPage> qaPageList;
	public List<Question> questionList;
	public List<Quotation> quotationList;
	public List<RadioClip> radioClipList;
	public List<RadioEpisode> radioEpisodeList;
	public List<RadioSeason> radioSeasonList;
	public List<RadioSeries> radioSeriesList;
	public List<Recipe> recipeList;
	public RecordedAt recordedAt;
	public ReleasedEvent releasedEvent;
	public List<Report> reportList;
	public List<ReportageNewsArticle> reportageNewsArticleList;
	public Container.Review review;
	public List<Clazz.Review> reviewList;
	public List<ReviewNewsArticle> reviewNewsArticleList;
	public SameAs sameAs;
	public List<SatiricalArticle> satiricalArticleList;
	public SchemaVersion schemaVersion;
	public List<ScholarlyArticle> scholarlyArticleList;
	public List<Sculpture> sculptureList;
	public SdDatePublished sdDatePublished;
	public SdLicense sdLicense;
	public SdPublisher sdPublisher;
	public List<SearchResultsPage> searchResultsPageList;
	public List<SiteNavigationElement> siteNavigationElementList;
	public List<SocialMediaPosting> socialMediaPostingList;
	public List<SoftwareApplication> softwareApplicationList;
	public List<SoftwareSourceCode> softwareSourceCodeList;
	public SourceOrganization sourceOrganization;
	public SpatialCoverage spatialCoverage;
	public Sponsor sponsor;
	public List<SpreadsheetDigitalDocument> spreadsheetDigitalDocumentList;
	public SubjectOf subjectOf;
	public List<TVClip> tvClipList;
	public List<TVEpisode> tvEpisodeList;
	public List<TVSeason> tvSeasonList;
	public List<TVSeries> tvSeriesList;
	public List<Table> tableList;
	public List<TechArticle> techArticleList;
	public TemporalCoverage temporalCoverage;
	public Text text;
	public List<TextDigitalDocument> textDigitalDocumentList;
	public List<Thesis> thesisList;
	public ThumbnailUrl thumbnailUrl;
	public TimeRequired timeRequired;
	public List<TouristTrip> touristTripList;
	public Trailer trailer;
	public List<TrainTrip> trainTripList;
	public TranslationOfWork translationOfWork;
	public Translator translator;
	public List<Trip> tripList;
	public TypicalAgeRange typicalAgeRange;
	public Url url;
	public List<UserReview> userReviewList;
	public Version version;
	public Video video;
	public List<VideoGallery> videoGalleryList;
	public List<VideoGame> videoGameList;
	public List<VideoGameClip> videoGameClipList;
	public List<VideoGameSeries> videoGameSeriesList;
	public List<VideoObject> videoObjectList;
	public List<VisualArtwork> visualArtworkList;
	public List<WPAdBlock> wpAdBlockList;
	public List<WPFooter> wpFooterList;
	public List<WPHeader> wpHeaderList;
	public List<WPSideBar> wpSideBarList;
	public List<WebApplication> webApplicationList;
	public List<WebPage> webPageList;
	public List<WebPageElement> webPageElementList;
	public List<WebSite> webSiteList;
	public WorkExample workExample;
	public WorkTranslation workTranslation;

	public EPISODE() {
	}

	public EPISODE(Long seq) {
		setSeq(seq);
	}

	public EPISODE(String string) {
		setName(new NAME(new TEXT(string)));
	}

	@Override
	public String getString() {
		if(name == null) return null;

		List<DataType.Text> textList = name.getTextList();
		if(textList == null || textList.size() == 0 || textList.get(0) == null) {
			return null;
		} else {
			return textList.get(0).getString();
		}
	}

	@Override
	public void setString(String string) {
		if(name == null) name = new NAME();

		List<DataType.Text> textList = name.getTextList();
		if(textList == null) {
			textList = new ArrayList<DataType.Text>();
			name.setTextList(textList);
		}
		if(textList.size() == 0) {
			textList.add(new TEXT(string));
		} else {
			textList.set(0, new TEXT(string));
		}
	}

	public EPISODE(APIReference apiReference) {
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

	public EPISODE(About about) {
		setAbout(about);
	}

	@Override
	public About getAbout() {
		return about;
	}

	@Override
	public void setAbout(About about) {
		this.about = about;
	}

	public EPISODE(AboutPage aboutPage) {
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

	public EPISODE(AccessMode accessMode) {
		setAccessMode(accessMode);
	}

	@Override
	public AccessMode getAccessMode() {
		return accessMode;
	}

	@Override
	public void setAccessMode(AccessMode accessMode) {
		this.accessMode = accessMode;
	}

	public EPISODE(AccessModeSufficient accessModeSufficient) {
		setAccessModeSufficient(accessModeSufficient);
	}

	@Override
	public AccessModeSufficient getAccessModeSufficient() {
		return accessModeSufficient;
	}

	@Override
	public void setAccessModeSufficient(AccessModeSufficient accessModeSufficient) {
		this.accessModeSufficient = accessModeSufficient;
	}

	public EPISODE(AccessibilityAPI accessibilityAPI) {
		setAccessibilityAPI(accessibilityAPI);
	}

	@Override
	public AccessibilityAPI getAccessibilityAPI() {
		return accessibilityAPI;
	}

	@Override
	public void setAccessibilityAPI(AccessibilityAPI accessibilityAPI) {
		this.accessibilityAPI = accessibilityAPI;
	}

	public EPISODE(AccessibilityControl accessibilityControl) {
		setAccessibilityControl(accessibilityControl);
	}

	@Override
	public AccessibilityControl getAccessibilityControl() {
		return accessibilityControl;
	}

	@Override
	public void setAccessibilityControl(AccessibilityControl accessibilityControl) {
		this.accessibilityControl = accessibilityControl;
	}

	public EPISODE(AccessibilityFeature accessibilityFeature) {
		setAccessibilityFeature(accessibilityFeature);
	}

	@Override
	public AccessibilityFeature getAccessibilityFeature() {
		return accessibilityFeature;
	}

	@Override
	public void setAccessibilityFeature(AccessibilityFeature accessibilityFeature) {
		this.accessibilityFeature = accessibilityFeature;
	}

	public EPISODE(AccessibilityHazard accessibilityHazard) {
		setAccessibilityHazard(accessibilityHazard);
	}

	@Override
	public AccessibilityHazard getAccessibilityHazard() {
		return accessibilityHazard;
	}

	@Override
	public void setAccessibilityHazard(AccessibilityHazard accessibilityHazard) {
		this.accessibilityHazard = accessibilityHazard;
	}

	public EPISODE(AccessibilitySummary accessibilitySummary) {
		setAccessibilitySummary(accessibilitySummary);
	}

	@Override
	public AccessibilitySummary getAccessibilitySummary() {
		return accessibilitySummary;
	}

	@Override
	public void setAccessibilitySummary(AccessibilitySummary accessibilitySummary) {
		this.accessibilitySummary = accessibilitySummary;
	}

	public EPISODE(AccountablePerson accountablePerson) {
		setAccountablePerson(accountablePerson);
	}

	@Override
	public AccountablePerson getAccountablePerson() {
		return accountablePerson;
	}

	@Override
	public void setAccountablePerson(AccountablePerson accountablePerson) {
		this.accountablePerson = accountablePerson;
	}

	public EPISODE(Actor actor) {
		setActor(actor);
	}

	@Override
	public Actor getActor() {
		return actor;
	}

	@Override
	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public EPISODE(AdditionalType additionalType) {
		setAdditionalType(additionalType);
	}

	@Override
	public AdditionalType getAdditionalType() {
		return additionalType;
	}

	@Override
	public void setAdditionalType(AdditionalType additionalType) {
		this.additionalType = additionalType;
	}

	public EPISODE(AdvertiserContentArticle advertiserContentArticle) {
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

	public EPISODE(AggregateRating aggregateRating) {
		setAggregateRating(aggregateRating);
	}

	@Override
	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	@Override
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	public EPISODE(AlternateName alternateName) {
		setAlternateName(alternateName);
	}

	@Override
	public AlternateName getAlternateName() {
		return alternateName;
	}

	@Override
	public void setAlternateName(AlternateName alternateName) {
		this.alternateName = alternateName;
	}

	public EPISODE(AlternativeHeadline alternativeHeadline) {
		setAlternativeHeadline(alternativeHeadline);
	}

	@Override
	public AlternativeHeadline getAlternativeHeadline() {
		return alternativeHeadline;
	}

	@Override
	public void setAlternativeHeadline(AlternativeHeadline alternativeHeadline) {
		this.alternativeHeadline = alternativeHeadline;
	}

	public EPISODE(AnalysisNewsArticle analysisNewsArticle) {
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

	public EPISODE(Answer answer) {
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

	public EPISODE(Article article) {
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

	public EPISODE(AskPublicNewsArticle askPublicNewsArticle) {
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

	public EPISODE(AssociatedMedia associatedMedia) {
		setAssociatedMedia(associatedMedia);
	}

	@Override
	public AssociatedMedia getAssociatedMedia() {
		return associatedMedia;
	}

	@Override
	public void setAssociatedMedia(AssociatedMedia associatedMedia) {
		this.associatedMedia = associatedMedia;
	}

	public EPISODE(Atlas atlas) {
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

	public EPISODE(Audience audience) {
		setAudience(audience);
	}

	@Override
	public Audience getAudience() {
		return audience;
	}

	@Override
	public void setAudience(Audience audience) {
		this.audience = audience;
	}

	public EPISODE(Audio audio) {
		setAudio(audio);
	}

	@Override
	public Audio getAudio() {
		return audio;
	}

	@Override
	public void setAudio(Audio audio) {
		this.audio = audio;
	}

	public EPISODE(AudioObject audioObject) {
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

	public EPISODE(Audiobook audiobook) {
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

	public EPISODE(Author author) {
		setAuthor(author);
	}

	@Override
	public Author getAuthor() {
		return author;
	}

	@Override
	public void setAuthor(Author author) {
		this.author = author;
	}

	public EPISODE(Award award) {
		setAward(award);
	}

	@Override
	public Award getAward() {
		return award;
	}

	@Override
	public void setAward(Award award) {
		this.award = award;
	}

	public EPISODE(BackgroundNewsArticle backgroundNewsArticle) {
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

	public EPISODE(Barcode barcode) {
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

	public EPISODE(Blog blog) {
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

	public EPISODE(BlogPosting blogPosting) {
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

	public EPISODE(Book book) {
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

	public EPISODE(BookSeries bookSeries) {
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

	public EPISODE(BusTrip busTrip) {
		busTripList = new ArrayList<BusTrip>();
		busTripList.add(busTrip);
	}

	@Override
	public BusTrip getBusTrip() {
		if(busTripList != null && busTripList.size() > 0) {
			return busTripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusTrip(BusTrip busTrip) {
		if(busTripList == null) {
			busTripList = new ArrayList<>();
		}
		if(busTripList.size() == 0) {
			busTripList.add(busTrip);
		} else {
			busTripList.set(0, busTrip);
		}
	}

	@Override
	public List<BusTrip> getBusTripList() {
		return busTripList;
	}

	@Override
	public void setBusTripList(List<BusTrip> busTripList) {
		this.busTripList = busTripList;
	}

	@Override
	public boolean hasBusTrip() {
		return busTripList != null && busTripList.size() > 0 && busTripList.get(0) != null;
	}

	public EPISODE(CategoryCodeSet categoryCodeSet) {
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

	public EPISODE(Chapter chapter) {
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

	public EPISODE(Character character) {
		setCharacter(character);
	}

	@Override
	public Character getCharacter() {
		return character;
	}

	@Override
	public void setCharacter(Character character) {
		this.character = character;
	}

	public EPISODE(CheckoutPage checkoutPage) {
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

	public EPISODE(Citation citation) {
		setCitation(citation);
	}

	@Override
	public Citation getCitation() {
		return citation;
	}

	@Override
	public void setCitation(Citation citation) {
		this.citation = citation;
	}

	public EPISODE(Claim claim) {
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

	public EPISODE(ClaimReview claimReview) {
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

	public EPISODE(Clip clip) {
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

	public EPISODE(Collection collection) {
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

	public EPISODE(CollectionPage collectionPage) {
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

	public EPISODE(ComicCoverArt comicCoverArt) {
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

	public EPISODE(ComicIssue comicIssue) {
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

	public EPISODE(ComicSeries comicSeries) {
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

	public EPISODE(ComicStory comicStory) {
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

	public EPISODE(Container.Comment comment) {
		setComment(comment);
	}

	@Override
	public void setComment(Container.Comment comment) {
		this.comment = comment;
	}

	public EPISODE(Clazz.Comment comment) {
		commentList = new ArrayList<Clazz.Comment>();
		commentList.add(comment);
	}

	@Override
	public COMMENT getComment() {
		Clazz.Comment cls = null;
		if(commentList != null && commentList.size() > 0) {
			cls = commentList.get(0);
		}
		Container.Comment ctn = comment;
		if(cls == null && ctn == null) {
			return null;
		}

		COMMENT impl = new COMMENT();
		if(cls != null) {
			impl.copy(cls);
		}
		if(ctn != null) {
			impl.copy(ctn);
		}
		return impl;
	}

	@Override
	public void setComment(Clazz.Comment comment) {
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
	public List<Clazz.Comment> getCommentList() {
		return commentList;
	}

	@Override
	public void setCommentList(List<Clazz.Comment> commentList) {
		this.commentList = commentList;
	}

	@Override
	public boolean hasComment() {
		return (commentList != null && commentList.size() > 0 && commentList.get(0) != null)
				|| comment != null;
	}

	public EPISODE(CommentCount commentCount) {
		setCommentCount(commentCount);
	}

	@Override
	public CommentCount getCommentCount() {
		return commentCount;
	}

	@Override
	public void setCommentCount(CommentCount commentCount) {
		this.commentCount = commentCount;
	}

	public EPISODE(CompleteDataFeed completeDataFeed) {
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

	public EPISODE(ContactPage contactPage) {
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

	public EPISODE(ContentLocation contentLocation) {
		setContentLocation(contentLocation);
	}

	@Override
	public ContentLocation getContentLocation() {
		return contentLocation;
	}

	@Override
	public void setContentLocation(ContentLocation contentLocation) {
		this.contentLocation = contentLocation;
	}

	public EPISODE(ContentRating contentRating) {
		setContentRating(contentRating);
	}

	@Override
	public ContentRating getContentRating() {
		return contentRating;
	}

	@Override
	public void setContentRating(ContentRating contentRating) {
		this.contentRating = contentRating;
	}

	public EPISODE(ContentReferenceTime contentReferenceTime) {
		setContentReferenceTime(contentReferenceTime);
	}

	@Override
	public ContentReferenceTime getContentReferenceTime() {
		return contentReferenceTime;
	}

	@Override
	public void setContentReferenceTime(ContentReferenceTime contentReferenceTime) {
		this.contentReferenceTime = contentReferenceTime;
	}

	public EPISODE(Contributor contributor) {
		setContributor(contributor);
	}

	@Override
	public Contributor getContributor() {
		return contributor;
	}

	@Override
	public void setContributor(Contributor contributor) {
		this.contributor = contributor;
	}

	public EPISODE(Conversation conversation) {
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

	public EPISODE(CopyrightHolder copyrightHolder) {
		setCopyrightHolder(copyrightHolder);
	}

	@Override
	public CopyrightHolder getCopyrightHolder() {
		return copyrightHolder;
	}

	@Override
	public void setCopyrightHolder(CopyrightHolder copyrightHolder) {
		this.copyrightHolder = copyrightHolder;
	}

	public EPISODE(CopyrightYear copyrightYear) {
		setCopyrightYear(copyrightYear);
	}

	@Override
	public CopyrightYear getCopyrightYear() {
		return copyrightYear;
	}

	@Override
	public void setCopyrightYear(CopyrightYear copyrightYear) {
		this.copyrightYear = copyrightYear;
	}

	public EPISODE(Correction correction) {
		setCorrection(correction);
	}

	@Override
	public Correction getCorrection() {
		return correction;
	}

	@Override
	public void setCorrection(Correction correction) {
		this.correction = correction;
	}

	public EPISODE(CorrectionComment correctionComment) {
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

	public EPISODE(Course course) {
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

	public EPISODE(CoverArt coverArt) {
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

	public EPISODE(CreativeWork creativeWork) {
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

	public EPISODE(CreativeWorkSeason creativeWorkSeason) {
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

	public EPISODE(CreativeWorkSeries creativeWorkSeries) {
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

	public EPISODE(Creator creator) {
		setCreator(creator);
	}

	@Override
	public Creator getCreator() {
		return creator;
	}

	@Override
	public void setCreator(Creator creator) {
		this.creator = creator;
	}

	public EPISODE(CriticReview criticReview) {
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

	public EPISODE(DataCatalog dataCatalog) {
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

	public EPISODE(DataDownload dataDownload) {
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

	public EPISODE(DataFeed dataFeed) {
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

	public EPISODE(Dataset dataset) {
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

	public EPISODE(DateCreated dateCreated) {
		setDateCreated(dateCreated);
	}

	@Override
	public DateCreated getDateCreated() {
		return dateCreated;
	}

	@Override
	public void setDateCreated(DateCreated dateCreated) {
		this.dateCreated = dateCreated;
	}

	public EPISODE(DateModified dateModified) {
		setDateModified(dateModified);
	}

	@Override
	public DateModified getDateModified() {
		return dateModified;
	}

	@Override
	public void setDateModified(DateModified dateModified) {
		this.dateModified = dateModified;
	}

	public EPISODE(DatePublished datePublished) {
		setDatePublished(datePublished);
	}

	@Override
	public DatePublished getDatePublished() {
		return datePublished;
	}

	@Override
	public void setDatePublished(DatePublished datePublished) {
		this.datePublished = datePublished;
	}

	public EPISODE(DefinedTermSet definedTermSet) {
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

	public EPISODE(Description description) {
		setDescription(description);
	}

	@Override
	public Description getDescription() {
		return description;
	}

	@Override
	public void setDescription(Description description) {
		this.description = description;
	}

	public EPISODE(Diet diet) {
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

	public EPISODE(DigitalDocument digitalDocument) {
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

	public EPISODE(Director director) {
		setDirector(director);
	}

	@Override
	public Director getDirector() {
		return director;
	}

	@Override
	public void setDirector(Director director) {
		this.director = director;
	}

	public EPISODE(DisambiguatingDescription disambiguatingDescription) {
		setDisambiguatingDescription(disambiguatingDescription);
	}

	@Override
	public DisambiguatingDescription getDisambiguatingDescription() {
		return disambiguatingDescription;
	}

	@Override
	public void setDisambiguatingDescription(DisambiguatingDescription disambiguatingDescription) {
		this.disambiguatingDescription = disambiguatingDescription;
	}

	public EPISODE(DiscussionForumPosting discussionForumPosting) {
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

	public EPISODE(DiscussionUrl discussionUrl) {
		setDiscussionUrl(discussionUrl);
	}

	@Override
	public DiscussionUrl getDiscussionUrl() {
		return discussionUrl;
	}

	@Override
	public void setDiscussionUrl(DiscussionUrl discussionUrl) {
		this.discussionUrl = discussionUrl;
	}

	public EPISODE(Editor editor) {
		setEditor(editor);
	}

	@Override
	public Editor getEditor() {
		return editor;
	}

	@Override
	public void setEditor(Editor editor) {
		this.editor = editor;
	}

	public EPISODE(EducationalAlignment educationalAlignment) {
		setEducationalAlignment(educationalAlignment);
	}

	@Override
	public EducationalAlignment getEducationalAlignment() {
		return educationalAlignment;
	}

	@Override
	public void setEducationalAlignment(EducationalAlignment educationalAlignment) {
		this.educationalAlignment = educationalAlignment;
	}

	public EPISODE(EducationalUse educationalUse) {
		setEducationalUse(educationalUse);
	}

	@Override
	public EducationalUse getEducationalUse() {
		return educationalUse;
	}

	@Override
	public void setEducationalUse(EducationalUse educationalUse) {
		this.educationalUse = educationalUse;
	}

	public EPISODE(EmailMessage emailMessage) {
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

	public EPISODE(EmployerReview employerReview) {
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

	public EPISODE(Encoding encoding) {
		setEncoding(encoding);
	}

	@Override
	public Encoding getEncoding() {
		return encoding;
	}

	@Override
	public void setEncoding(Encoding encoding) {
		this.encoding = encoding;
	}

	public EPISODE(EncodingFormat encodingFormat) {
		setEncodingFormat(encodingFormat);
	}

	@Override
	public EncodingFormat getEncodingFormat() {
		return encodingFormat;
	}

	@Override
	public void setEncodingFormat(EncodingFormat encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	public EPISODE(Clazz.Episode episode) {
		episodeList = new ArrayList<Clazz.Episode>();
		episodeList.add(episode);
	}

	@Override
	public Clazz.Episode getEpisode() {
		if(episodeList != null && episodeList.size() > 0) {
			return episodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEpisode(Clazz.Episode episode) {
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
	public List<Clazz.Episode> getEpisodeList() {
		return episodeList;
	}

	@Override
	public void setEpisodeList(List<Clazz.Episode> episodeList) {
		this.episodeList = episodeList;
	}

	@Override
	public boolean hasEpisode() {
		return episodeList != null && episodeList.size() > 0 && episodeList.get(0) != null;
	}

	public EPISODE(EpisodeNumber episodeNumber) {
		setEpisodeNumber(episodeNumber);
	}

	@Override
	public EpisodeNumber getEpisodeNumber() {
		return episodeNumber;
	}

	@Override
	public void setEpisodeNumber(EpisodeNumber episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

	public EPISODE(ExampleOfWork exampleOfWork) {
		setExampleOfWork(exampleOfWork);
	}

	@Override
	public ExampleOfWork getExampleOfWork() {
		return exampleOfWork;
	}

	@Override
	public void setExampleOfWork(ExampleOfWork exampleOfWork) {
		this.exampleOfWork = exampleOfWork;
	}

	public EPISODE(ExercisePlan exercisePlan) {
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

	public EPISODE(Expires expires) {
		setExpires(expires);
	}

	@Override
	public Expires getExpires() {
		return expires;
	}

	@Override
	public void setExpires(Expires expires) {
		this.expires = expires;
	}

	public EPISODE(FAQPage faqPage) {
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

	public EPISODE(Flight flight) {
		flightList = new ArrayList<Flight>();
		flightList.add(flight);
	}

	@Override
	public Flight getFlight() {
		if(flightList != null && flightList.size() > 0) {
			return flightList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFlight(Flight flight) {
		if(flightList == null) {
			flightList = new ArrayList<>();
		}
		if(flightList.size() == 0) {
			flightList.add(flight);
		} else {
			flightList.set(0, flight);
		}
	}

	@Override
	public List<Flight> getFlightList() {
		return flightList;
	}

	@Override
	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
	}

	@Override
	public boolean hasFlight() {
		return flightList != null && flightList.size() > 0 && flightList.get(0) != null;
	}

	public EPISODE(Funder funder) {
		setFunder(funder);
	}

	@Override
	public Funder getFunder() {
		return funder;
	}

	@Override
	public void setFunder(Funder funder) {
		this.funder = funder;
	}

	public EPISODE(Game game) {
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

	public EPISODE(Genre genre) {
		setGenre(genre);
	}

	@Override
	public Genre getGenre() {
		return genre;
	}

	@Override
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public EPISODE(HasPart hasPart) {
		setHasPart(hasPart);
	}

	@Override
	public HasPart getHasPart() {
		return hasPart;
	}

	@Override
	public void setHasPart(HasPart hasPart) {
		this.hasPart = hasPart;
	}

	public EPISODE(Headline headline) {
		setHeadline(headline);
	}

	@Override
	public Headline getHeadline() {
		return headline;
	}

	@Override
	public void setHeadline(Headline headline) {
		this.headline = headline;
	}

	public EPISODE(HowTo howTo) {
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

	public EPISODE(HowToDirection howToDirection) {
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

	public EPISODE(HowToSection howToSection) {
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

	public EPISODE(HowToStep howToStep) {
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

	public EPISODE(HowToTip howToTip) {
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

	public EPISODE(Identifier identifier) {
		setIdentifier(identifier);
	}

	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	@Override
	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

	public EPISODE(Image image) {
		setImage(image);
	}

	@Override
	public Image getImage() {
		return image;
	}

	@Override
	public void setImage(Image image) {
		this.image = image;
	}

	public EPISODE(ImageGallery imageGallery) {
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

	public EPISODE(ImageObject imageObject) {
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

	public EPISODE(InLanguage inLanguage) {
		setInLanguage(inLanguage);
	}

	@Override
	public InLanguage getInLanguage() {
		return inLanguage;
	}

	@Override
	public void setInLanguage(InLanguage inLanguage) {
		this.inLanguage = inLanguage;
	}

	public EPISODE(InteractionStatistic interactionStatistic) {
		setInteractionStatistic(interactionStatistic);
	}

	@Override
	public InteractionStatistic getInteractionStatistic() {
		return interactionStatistic;
	}

	@Override
	public void setInteractionStatistic(InteractionStatistic interactionStatistic) {
		this.interactionStatistic = interactionStatistic;
	}

	public EPISODE(InteractivityType interactivityType) {
		setInteractivityType(interactivityType);
	}

	@Override
	public InteractivityType getInteractivityType() {
		return interactivityType;
	}

	@Override
	public void setInteractivityType(InteractivityType interactivityType) {
		this.interactivityType = interactivityType;
	}

	public EPISODE(IsAccessibleForFree isAccessibleForFree) {
		setIsAccessibleForFree(isAccessibleForFree);
	}

	@Override
	public IsAccessibleForFree getIsAccessibleForFree() {
		return isAccessibleForFree;
	}

	@Override
	public void setIsAccessibleForFree(IsAccessibleForFree isAccessibleForFree) {
		this.isAccessibleForFree = isAccessibleForFree;
	}

	public EPISODE(IsBasedOn isBasedOn) {
		setIsBasedOn(isBasedOn);
	}

	@Override
	public IsBasedOn getIsBasedOn() {
		return isBasedOn;
	}

	@Override
	public void setIsBasedOn(IsBasedOn isBasedOn) {
		this.isBasedOn = isBasedOn;
	}

	public EPISODE(IsFamilyFriendly isFamilyFriendly) {
		setIsFamilyFriendly(isFamilyFriendly);
	}

	@Override
	public IsFamilyFriendly getIsFamilyFriendly() {
		return isFamilyFriendly;
	}

	@Override
	public void setIsFamilyFriendly(IsFamilyFriendly isFamilyFriendly) {
		this.isFamilyFriendly = isFamilyFriendly;
	}

	public EPISODE(IsPartOf isPartOf) {
		setIsPartOf(isPartOf);
	}

	@Override
	public IsPartOf getIsPartOf() {
		return isPartOf;
	}

	@Override
	public void setIsPartOf(IsPartOf isPartOf) {
		this.isPartOf = isPartOf;
	}

	public EPISODE(ItemPage itemPage) {
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

	public EPISODE(Keywords keywords) {
		setKeywords(keywords);
	}

	@Override
	public Keywords getKeywords() {
		return keywords;
	}

	@Override
	public void setKeywords(Keywords keywords) {
		this.keywords = keywords;
	}

	public EPISODE(LearningResourceType learningResourceType) {
		setLearningResourceType(learningResourceType);
	}

	@Override
	public LearningResourceType getLearningResourceType() {
		return learningResourceType;
	}

	@Override
	public void setLearningResourceType(LearningResourceType learningResourceType) {
		this.learningResourceType = learningResourceType;
	}

	public EPISODE(Legislation legislation) {
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

	public EPISODE(LegislationObject legislationObject) {
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

	public EPISODE(License license) {
		setLicense(license);
	}

	@Override
	public License getLicense() {
		return license;
	}

	@Override
	public void setLicense(License license) {
		this.license = license;
	}

	public EPISODE(LiveBlogPosting liveBlogPosting) {
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

	public EPISODE(LocationCreated locationCreated) {
		setLocationCreated(locationCreated);
	}

	@Override
	public LocationCreated getLocationCreated() {
		return locationCreated;
	}

	@Override
	public void setLocationCreated(LocationCreated locationCreated) {
		this.locationCreated = locationCreated;
	}

	public EPISODE(MainEntity mainEntity) {
		setMainEntity(mainEntity);
	}

	@Override
	public MainEntity getMainEntity() {
		return mainEntity;
	}

	@Override
	public void setMainEntity(MainEntity mainEntity) {
		this.mainEntity = mainEntity;
	}

	public EPISODE(MainEntityOfPage mainEntityOfPage) {
		setMainEntityOfPage(mainEntityOfPage);
	}

	@Override
	public MainEntityOfPage getMainEntityOfPage() {
		return mainEntityOfPage;
	}

	@Override
	public void setMainEntityOfPage(MainEntityOfPage mainEntityOfPage) {
		this.mainEntityOfPage = mainEntityOfPage;
	}

	public EPISODE(Map map) {
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

	public EPISODE(Material material) {
		setMaterial(material);
	}

	@Override
	public Material getMaterial() {
		return material;
	}

	@Override
	public void setMaterial(Material material) {
		this.material = material;
	}

	public EPISODE(MediaObject mediaObject) {
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

	public EPISODE(MedicalScholarlyArticle medicalScholarlyArticle) {
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

	public EPISODE(MedicalWebPage medicalWebPage) {
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

	public EPISODE(Mentions mentions) {
		setMentions(mentions);
	}

	@Override
	public Mentions getMentions() {
		return mentions;
	}

	@Override
	public void setMentions(Mentions mentions) {
		this.mentions = mentions;
	}

	public EPISODE(Menu menu) {
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

	public EPISODE(MenuSection menuSection) {
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

	public EPISODE(Message message) {
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

	public EPISODE(MobileApplication mobileApplication) {
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

	public EPISODE(Movie movie) {
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

	public EPISODE(MovieClip movieClip) {
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

	public EPISODE(MovieSeries movieSeries) {
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

	public EPISODE(MusicAlbum musicAlbum) {
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

	public EPISODE(MusicBy musicBy) {
		setMusicBy(musicBy);
	}

	@Override
	public MusicBy getMusicBy() {
		return musicBy;
	}

	@Override
	public void setMusicBy(MusicBy musicBy) {
		this.musicBy = musicBy;
	}

	public EPISODE(MusicComposition musicComposition) {
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

	public EPISODE(MusicPlaylist musicPlaylist) {
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

	public EPISODE(MusicRecording musicRecording) {
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

	public EPISODE(MusicRelease musicRelease) {
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

	public EPISODE(MusicVideoObject musicVideoObject) {
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

	public EPISODE(Name name) {
		setName(name);
	}

	@Override
	public Name getName() {
		return name;
	}

	@Override
	public void setName(Name name) {
		this.name = name;
	}

	public EPISODE(NameFuzzy nameFuzzy) {
		setNameFuzzy(nameFuzzy);
	}

	@Override
	public NameFuzzy getNameFuzzy() {
		return nameFuzzy;
	}

	@Override
	public void setNameFuzzy(NameFuzzy nameFuzzy) {
		this.nameFuzzy = nameFuzzy;
	}

	public EPISODE(NameRuby nameRuby) {
		setNameRuby(nameRuby);
	}

	@Override
	public NameRuby getNameRuby() {
		return nameRuby;
	}

	@Override
	public void setNameRuby(NameRuby nameRuby) {
		this.nameRuby = nameRuby;
	}

	public EPISODE(NewsArticle newsArticle) {
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

	public EPISODE(Newspaper newspaper) {
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

	public EPISODE(NoteDigitalDocument noteDigitalDocument) {
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

	public EPISODE(Offers offers) {
		setOffers(offers);
	}

	@Override
	public Offers getOffers() {
		return offers;
	}

	@Override
	public void setOffers(Offers offers) {
		this.offers = offers;
	}

	public EPISODE(OpinionNewsArticle opinionNewsArticle) {
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

	public EPISODE(Painting painting) {
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

	public EPISODE(PartOfSeason partOfSeason) {
		setPartOfSeason(partOfSeason);
	}

	@Override
	public PartOfSeason getPartOfSeason() {
		return partOfSeason;
	}

	@Override
	public void setPartOfSeason(PartOfSeason partOfSeason) {
		this.partOfSeason = partOfSeason;
	}

	public EPISODE(PartOfSeries partOfSeries) {
		setPartOfSeries(partOfSeries);
	}

	@Override
	public PartOfSeries getPartOfSeries() {
		return partOfSeries;
	}

	@Override
	public void setPartOfSeries(PartOfSeries partOfSeries) {
		this.partOfSeries = partOfSeries;
	}

	public EPISODE(Periodical periodical) {
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

	public EPISODE(Photograph photograph) {
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

	public EPISODE(Position position) {
		setPosition(position);
	}

	@Override
	public Position getPosition() {
		return position;
	}

	@Override
	public void setPosition(Position position) {
		this.position = position;
	}

	public EPISODE(PotentialAction potentialAction) {
		setPotentialAction(potentialAction);
	}

	@Override
	public PotentialAction getPotentialAction() {
		return potentialAction;
	}

	@Override
	public void setPotentialAction(PotentialAction potentialAction) {
		this.potentialAction = potentialAction;
	}

	public EPISODE(PresentationDigitalDocument presentationDigitalDocument) {
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

	public EPISODE(Producer producer) {
		setProducer(producer);
	}

	@Override
	public Producer getProducer() {
		return producer;
	}

	@Override
	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public EPISODE(ProductionCompany productionCompany) {
		setProductionCompany(productionCompany);
	}

	@Override
	public ProductionCompany getProductionCompany() {
		return productionCompany;
	}

	@Override
	public void setProductionCompany(ProductionCompany productionCompany) {
		this.productionCompany = productionCompany;
	}

	public EPISODE(ProfilePage profilePage) {
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

	public EPISODE(Provider provider) {
		setProvider(provider);
	}

	@Override
	public Provider getProvider() {
		return provider;
	}

	@Override
	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public EPISODE(Publication publication) {
		setPublication(publication);
	}

	@Override
	public Publication getPublication() {
		return publication;
	}

	@Override
	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public EPISODE(PublicationIssue publicationIssue) {
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

	public EPISODE(PublicationVolume publicationVolume) {
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

	public EPISODE(Publisher publisher) {
		setPublisher(publisher);
	}

	@Override
	public Publisher getPublisher() {
		return publisher;
	}

	@Override
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public EPISODE(PublisherImprint publisherImprint) {
		setPublisherImprint(publisherImprint);
	}

	@Override
	public PublisherImprint getPublisherImprint() {
		return publisherImprint;
	}

	@Override
	public void setPublisherImprint(PublisherImprint publisherImprint) {
		this.publisherImprint = publisherImprint;
	}

	public EPISODE(PublishingPrinciples publishingPrinciples) {
		setPublishingPrinciples(publishingPrinciples);
	}

	@Override
	public PublishingPrinciples getPublishingPrinciples() {
		return publishingPrinciples;
	}

	@Override
	public void setPublishingPrinciples(PublishingPrinciples publishingPrinciples) {
		this.publishingPrinciples = publishingPrinciples;
	}

	public EPISODE(QAPage qaPage) {
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

	public EPISODE(Question question) {
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

	public EPISODE(Quotation quotation) {
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

	public EPISODE(RadioClip radioClip) {
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

	public EPISODE(RadioEpisode radioEpisode) {
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

	public EPISODE(RadioSeason radioSeason) {
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

	public EPISODE(RadioSeries radioSeries) {
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

	public EPISODE(Recipe recipe) {
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

	public EPISODE(RecordedAt recordedAt) {
		setRecordedAt(recordedAt);
	}

	@Override
	public RecordedAt getRecordedAt() {
		return recordedAt;
	}

	@Override
	public void setRecordedAt(RecordedAt recordedAt) {
		this.recordedAt = recordedAt;
	}

	public EPISODE(ReleasedEvent releasedEvent) {
		setReleasedEvent(releasedEvent);
	}

	@Override
	public ReleasedEvent getReleasedEvent() {
		return releasedEvent;
	}

	@Override
	public void setReleasedEvent(ReleasedEvent releasedEvent) {
		this.releasedEvent = releasedEvent;
	}

	public EPISODE(Report report) {
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

	public EPISODE(ReportageNewsArticle reportageNewsArticle) {
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

	public EPISODE(Container.Review review) {
		setReview(review);
	}

	@Override
	public void setReview(Container.Review review) {
		this.review = review;
	}

	public EPISODE(Clazz.Review review) {
		reviewList = new ArrayList<Clazz.Review>();
		reviewList.add(review);
	}

	@Override
	public REVIEW getReview() {
		Clazz.Review cls = null;
		if(reviewList != null && reviewList.size() > 0) {
			cls = reviewList.get(0);
		}
		Container.Review ctn = review;
		if(cls == null && ctn == null) {
			return null;
		}

		REVIEW impl = new REVIEW();
		if(cls != null) {
			impl.copy(cls);
		}
		if(ctn != null) {
			impl.copy(ctn);
		}
		return impl;
	}

	@Override
	public void setReview(Clazz.Review review) {
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
	public List<Clazz.Review> getReviewList() {
		return reviewList;
	}

	@Override
	public void setReviewList(List<Clazz.Review> reviewList) {
		this.reviewList = reviewList;
	}

	@Override
	public boolean hasReview() {
		return (reviewList != null && reviewList.size() > 0 && reviewList.get(0) != null)
				|| review != null;
	}

	public EPISODE(ReviewNewsArticle reviewNewsArticle) {
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

	public EPISODE(SameAs sameAs) {
		setSameAs(sameAs);
	}

	@Override
	public SameAs getSameAs() {
		return sameAs;
	}

	@Override
	public void setSameAs(SameAs sameAs) {
		this.sameAs = sameAs;
	}

	public EPISODE(SatiricalArticle satiricalArticle) {
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

	public EPISODE(SchemaVersion schemaVersion) {
		setSchemaVersion(schemaVersion);
	}

	@Override
	public SchemaVersion getSchemaVersion() {
		return schemaVersion;
	}

	@Override
	public void setSchemaVersion(SchemaVersion schemaVersion) {
		this.schemaVersion = schemaVersion;
	}

	public EPISODE(ScholarlyArticle scholarlyArticle) {
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

	public EPISODE(Sculpture sculpture) {
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

	public EPISODE(SdDatePublished sdDatePublished) {
		setSdDatePublished(sdDatePublished);
	}

	@Override
	public SdDatePublished getSdDatePublished() {
		return sdDatePublished;
	}

	@Override
	public void setSdDatePublished(SdDatePublished sdDatePublished) {
		this.sdDatePublished = sdDatePublished;
	}

	public EPISODE(SdLicense sdLicense) {
		setSdLicense(sdLicense);
	}

	@Override
	public SdLicense getSdLicense() {
		return sdLicense;
	}

	@Override
	public void setSdLicense(SdLicense sdLicense) {
		this.sdLicense = sdLicense;
	}

	public EPISODE(SdPublisher sdPublisher) {
		setSdPublisher(sdPublisher);
	}

	@Override
	public SdPublisher getSdPublisher() {
		return sdPublisher;
	}

	@Override
	public void setSdPublisher(SdPublisher sdPublisher) {
		this.sdPublisher = sdPublisher;
	}

	public EPISODE(SearchResultsPage searchResultsPage) {
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

	public EPISODE(SiteNavigationElement siteNavigationElement) {
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

	public EPISODE(SocialMediaPosting socialMediaPosting) {
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

	public EPISODE(SoftwareApplication softwareApplication) {
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

	public EPISODE(SoftwareSourceCode softwareSourceCode) {
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

	public EPISODE(SourceOrganization sourceOrganization) {
		setSourceOrganization(sourceOrganization);
	}

	@Override
	public SourceOrganization getSourceOrganization() {
		return sourceOrganization;
	}

	@Override
	public void setSourceOrganization(SourceOrganization sourceOrganization) {
		this.sourceOrganization = sourceOrganization;
	}

	public EPISODE(SpatialCoverage spatialCoverage) {
		setSpatialCoverage(spatialCoverage);
	}

	@Override
	public SpatialCoverage getSpatialCoverage() {
		return spatialCoverage;
	}

	@Override
	public void setSpatialCoverage(SpatialCoverage spatialCoverage) {
		this.spatialCoverage = spatialCoverage;
	}

	public EPISODE(Sponsor sponsor) {
		setSponsor(sponsor);
	}

	@Override
	public Sponsor getSponsor() {
		return sponsor;
	}

	@Override
	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}

	public EPISODE(SpreadsheetDigitalDocument spreadsheetDigitalDocument) {
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

	public EPISODE(SubjectOf subjectOf) {
		setSubjectOf(subjectOf);
	}

	@Override
	public SubjectOf getSubjectOf() {
		return subjectOf;
	}

	@Override
	public void setSubjectOf(SubjectOf subjectOf) {
		this.subjectOf = subjectOf;
	}

	public EPISODE(TVClip tvClip) {
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

	public EPISODE(TVEpisode tvEpisode) {
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

	public EPISODE(TVSeason tvSeason) {
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

	public EPISODE(TVSeries tvSeries) {
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

	public EPISODE(Table table) {
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

	public EPISODE(TechArticle techArticle) {
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

	public EPISODE(TemporalCoverage temporalCoverage) {
		setTemporalCoverage(temporalCoverage);
	}

	@Override
	public TemporalCoverage getTemporalCoverage() {
		return temporalCoverage;
	}

	@Override
	public void setTemporalCoverage(TemporalCoverage temporalCoverage) {
		this.temporalCoverage = temporalCoverage;
	}

	public EPISODE(Text text) {
		setText(text);
	}

	@Override
	public Text getText() {
		return text;
	}

	@Override
	public void setText(Text text) {
		this.text = text;
	}

	public EPISODE(TextDigitalDocument textDigitalDocument) {
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

	public EPISODE(Thesis thesis) {
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

	public EPISODE(ThumbnailUrl thumbnailUrl) {
		setThumbnailUrl(thumbnailUrl);
	}

	@Override
	public ThumbnailUrl getThumbnailUrl() {
		return thumbnailUrl;
	}

	@Override
	public void setThumbnailUrl(ThumbnailUrl thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public EPISODE(TimeRequired timeRequired) {
		setTimeRequired(timeRequired);
	}

	@Override
	public TimeRequired getTimeRequired() {
		return timeRequired;
	}

	@Override
	public void setTimeRequired(TimeRequired timeRequired) {
		this.timeRequired = timeRequired;
	}

	public EPISODE(TouristTrip touristTrip) {
		touristTripList = new ArrayList<TouristTrip>();
		touristTripList.add(touristTrip);
	}

	@Override
	public TouristTrip getTouristTrip() {
		if(touristTripList != null && touristTripList.size() > 0) {
			return touristTripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTouristTrip(TouristTrip touristTrip) {
		if(touristTripList == null) {
			touristTripList = new ArrayList<>();
		}
		if(touristTripList.size() == 0) {
			touristTripList.add(touristTrip);
		} else {
			touristTripList.set(0, touristTrip);
		}
	}

	@Override
	public List<TouristTrip> getTouristTripList() {
		return touristTripList;
	}

	@Override
	public void setTouristTripList(List<TouristTrip> touristTripList) {
		this.touristTripList = touristTripList;
	}

	@Override
	public boolean hasTouristTrip() {
		return touristTripList != null && touristTripList.size() > 0 && touristTripList.get(0) != null;
	}

	public EPISODE(Trailer trailer) {
		setTrailer(trailer);
	}

	@Override
	public Trailer getTrailer() {
		return trailer;
	}

	@Override
	public void setTrailer(Trailer trailer) {
		this.trailer = trailer;
	}

	public EPISODE(TrainTrip trainTrip) {
		trainTripList = new ArrayList<TrainTrip>();
		trainTripList.add(trainTrip);
	}

	@Override
	public TrainTrip getTrainTrip() {
		if(trainTripList != null && trainTripList.size() > 0) {
			return trainTripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrainTrip(TrainTrip trainTrip) {
		if(trainTripList == null) {
			trainTripList = new ArrayList<>();
		}
		if(trainTripList.size() == 0) {
			trainTripList.add(trainTrip);
		} else {
			trainTripList.set(0, trainTrip);
		}
	}

	@Override
	public List<TrainTrip> getTrainTripList() {
		return trainTripList;
	}

	@Override
	public void setTrainTripList(List<TrainTrip> trainTripList) {
		this.trainTripList = trainTripList;
	}

	@Override
	public boolean hasTrainTrip() {
		return trainTripList != null && trainTripList.size() > 0 && trainTripList.get(0) != null;
	}

	public EPISODE(TranslationOfWork translationOfWork) {
		setTranslationOfWork(translationOfWork);
	}

	@Override
	public TranslationOfWork getTranslationOfWork() {
		return translationOfWork;
	}

	@Override
	public void setTranslationOfWork(TranslationOfWork translationOfWork) {
		this.translationOfWork = translationOfWork;
	}

	public EPISODE(Translator translator) {
		setTranslator(translator);
	}

	@Override
	public Translator getTranslator() {
		return translator;
	}

	@Override
	public void setTranslator(Translator translator) {
		this.translator = translator;
	}

	public EPISODE(Trip trip) {
		tripList = new ArrayList<Trip>();
		tripList.add(trip);
	}

	@Override
	public Trip getTrip() {
		if(tripList != null && tripList.size() > 0) {
			return tripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrip(Trip trip) {
		if(tripList == null) {
			tripList = new ArrayList<>();
		}
		if(tripList.size() == 0) {
			tripList.add(trip);
		} else {
			tripList.set(0, trip);
		}
	}

	@Override
	public List<Trip> getTripList() {
		return tripList;
	}

	@Override
	public void setTripList(List<Trip> tripList) {
		this.tripList = tripList;
	}

	@Override
	public boolean hasTrip() {
		return tripList != null && tripList.size() > 0 && tripList.get(0) != null;
	}

	public EPISODE(TypicalAgeRange typicalAgeRange) {
		setTypicalAgeRange(typicalAgeRange);
	}

	@Override
	public TypicalAgeRange getTypicalAgeRange() {
		return typicalAgeRange;
	}

	@Override
	public void setTypicalAgeRange(TypicalAgeRange typicalAgeRange) {
		this.typicalAgeRange = typicalAgeRange;
	}

	public EPISODE(Url url) {
		setUrl(url);
	}

	@Override
	public Url getUrl() {
		return url;
	}

	@Override
	public void setUrl(Url url) {
		this.url = url;
	}

	public EPISODE(UserReview userReview) {
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

	public EPISODE(Version version) {
		setVersion(version);
	}

	@Override
	public Version getVersion() {
		return version;
	}

	@Override
	public void setVersion(Version version) {
		this.version = version;
	}

	public EPISODE(Video video) {
		setVideo(video);
	}

	@Override
	public Video getVideo() {
		return video;
	}

	@Override
	public void setVideo(Video video) {
		this.video = video;
	}

	public EPISODE(VideoGallery videoGallery) {
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

	public EPISODE(VideoGame videoGame) {
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

	public EPISODE(VideoGameClip videoGameClip) {
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

	public EPISODE(VideoGameSeries videoGameSeries) {
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

	public EPISODE(VideoObject videoObject) {
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

	public EPISODE(VisualArtwork visualArtwork) {
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

	public EPISODE(WPAdBlock wpAdBlock) {
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

	public EPISODE(WPFooter wpFooter) {
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

	public EPISODE(WPHeader wpHeader) {
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

	public EPISODE(WPSideBar wpSideBar) {
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

	public EPISODE(WebApplication webApplication) {
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

	public EPISODE(WebPage webPage) {
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

	public EPISODE(WebPageElement webPageElement) {
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

	public EPISODE(WebSite webSite) {
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

	public EPISODE(WorkExample workExample) {
		setWorkExample(workExample);
	}

	@Override
	public WorkExample getWorkExample() {
		return workExample;
	}

	@Override
	public void setWorkExample(WorkExample workExample) {
		this.workExample = workExample;
	}

	public EPISODE(WorkTranslation workTranslation) {
		setWorkTranslation(workTranslation);
	}

	@Override
	public WorkTranslation getWorkTranslation() {
		return workTranslation;
	}

	@Override
	public void setWorkTranslation(WorkTranslation workTranslation) {
		this.workTranslation = workTranslation;
	}

	public void copy(Clazz.Episode org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAbout(org.getAbout());
		setAccessMode(org.getAccessMode());
		setAccessModeSufficient(org.getAccessModeSufficient());
		setAccessibilityAPI(org.getAccessibilityAPI());
		setAccessibilityControl(org.getAccessibilityControl());
		setAccessibilityFeature(org.getAccessibilityFeature());
		setAccessibilityHazard(org.getAccessibilityHazard());
		setAccessibilitySummary(org.getAccessibilitySummary());
		setAccountablePerson(org.getAccountablePerson());
		setActor(org.getActor());
		setAdditionalType(org.getAdditionalType());
		setAggregateRating(org.getAggregateRating());
		setAlternateName(org.getAlternateName());
		setAlternativeHeadline(org.getAlternativeHeadline());
		setAssociatedMedia(org.getAssociatedMedia());
		setAudience(org.getAudience());
		setAudio(org.getAudio());
		setAuthor(org.getAuthor());
		setAward(org.getAward());
		setCharacter(org.getCharacter());
		setCitation(org.getCitation());
		setComment(org.getComment());
		setCommentCount(org.getCommentCount());
		setContentLocation(org.getContentLocation());
		setContentRating(org.getContentRating());
		setContentReferenceTime(org.getContentReferenceTime());
		setContributor(org.getContributor());
		setCopyrightHolder(org.getCopyrightHolder());
		setCopyrightYear(org.getCopyrightYear());
		setCorrection(org.getCorrection());
		setCreator(org.getCreator());
		setDateCreated(org.getDateCreated());
		setDateModified(org.getDateModified());
		setDatePublished(org.getDatePublished());
		setDescription(org.getDescription());
		setDirector(org.getDirector());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDiscussionUrl(org.getDiscussionUrl());
		setEditor(org.getEditor());
		setEducationalAlignment(org.getEducationalAlignment());
		setEducationalUse(org.getEducationalUse());
		setEncoding(org.getEncoding());
		setEncodingFormat(org.getEncodingFormat());
		setEpisodeNumber(org.getEpisodeNumber());
		setExampleOfWork(org.getExampleOfWork());
		setExpires(org.getExpires());
		setFunder(org.getFunder());
		setGenre(org.getGenre());
		setHasPart(org.getHasPart());
		setHeadline(org.getHeadline());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setInLanguage(org.getInLanguage());
		setInteractionStatistic(org.getInteractionStatistic());
		setInteractivityType(org.getInteractivityType());
		setIsAccessibleForFree(org.getIsAccessibleForFree());
		setIsBasedOn(org.getIsBasedOn());
		setIsFamilyFriendly(org.getIsFamilyFriendly());
		setIsPartOf(org.getIsPartOf());
		setKeywords(org.getKeywords());
		setLearningResourceType(org.getLearningResourceType());
		setLicense(org.getLicense());
		setLocationCreated(org.getLocationCreated());
		setMainEntity(org.getMainEntity());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMaterial(org.getMaterial());
		setMentions(org.getMentions());
		setMusicBy(org.getMusicBy());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOffers(org.getOffers());
		setPartOfSeason(org.getPartOfSeason());
		setPartOfSeries(org.getPartOfSeries());
		setPosition(org.getPosition());
		setPotentialAction(org.getPotentialAction());
		setProducer(org.getProducer());
		setProductionCompany(org.getProductionCompany());
		setProvider(org.getProvider());
		setPublication(org.getPublication());
		setPublisher(org.getPublisher());
		setPublisherImprint(org.getPublisherImprint());
		setPublishingPrinciples(org.getPublishingPrinciples());
		setRecordedAt(org.getRecordedAt());
		setReleasedEvent(org.getReleasedEvent());
		setReview(org.getReview());
		setSameAs(org.getSameAs());
		setSchemaVersion(org.getSchemaVersion());
		setSdDatePublished(org.getSdDatePublished());
		setSdLicense(org.getSdLicense());
		setSdPublisher(org.getSdPublisher());
		setSourceOrganization(org.getSourceOrganization());
		setSpatialCoverage(org.getSpatialCoverage());
		setSponsor(org.getSponsor());
		setSubjectOf(org.getSubjectOf());
		setTemporalCoverage(org.getTemporalCoverage());
		setText(org.getText());
		setThumbnailUrl(org.getThumbnailUrl());
		setTimeRequired(org.getTimeRequired());
		setTrailer(org.getTrailer());
		setTranslationOfWork(org.getTranslationOfWork());
		setTranslator(org.getTranslator());
		setTypicalAgeRange(org.getTypicalAgeRange());
		setUrl(org.getUrl());
		setVersion(org.getVersion());
		setVideo(org.getVideo());
		setWorkExample(org.getWorkExample());
		setWorkTranslation(org.getWorkTranslation());
	}

	public void copy(Container.Episode org) {
		setAPIReferenceList(org.getAPIReferenceList());
		setAboutPageList(org.getAboutPageList());
		setAdvertiserContentArticleList(org.getAdvertiserContentArticleList());
		setAnalysisNewsArticleList(org.getAnalysisNewsArticleList());
		setAnswerList(org.getAnswerList());
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
		setBusTripList(org.getBusTripList());
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
		setEmailMessageList(org.getEmailMessageList());
		setEmployerReviewList(org.getEmployerReviewList());
		setEpisodeList(org.getEpisodeList());
		setExercisePlanList(org.getExercisePlanList());
		setFAQPageList(org.getFAQPageList());
		setFlightList(org.getFlightList());
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
		setTouristTripList(org.getTouristTripList());
		setTrainTripList(org.getTrainTripList());
		setTripList(org.getTripList());
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
		return getString();
	}

	@Override
	public Long getSeq() {
		return seq;
	}

	@Override
	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Override
	public Long getRefSeq() {
		return refSeq;
	}

	@Override
	public void setRefSeq(Long refSeq) {
		this.refSeq = refSeq;
	}

	@Override
	public String getRefAcr() {
		return refAcr;
	}

	@Override
	public void setRefAcr(String refAcr) {
		this.refAcr = refAcr;
	}

	@Override
	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public void setCreatedAt(java.util.Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public Long getCreatedBy() {
		return createdBy;
	}

	@Override
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public java.util.Date getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public void setUpdatedAt(java.util.Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public Long getUpdatedBy() {
		return updatedBy;
	}

	@Override
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public java.util.Date getExpiredAt() {
		return expiredAt;
	}

	@Override
	public void setExpiredAt(java.util.Date expiredAt) {
		this.expiredAt = expiredAt;
	}

	@Override
	public Long getExpiredBy() {
		return expiredBy;
	}

	@Override
	public void setExpiredBy(Long expiredBy) {
		this.expiredBy = expiredBy;
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
