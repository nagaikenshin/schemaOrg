package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.bib.Container.PublisherImprint;
import org.kyojo.schemaorg.m3n4.bib.Container.TranslationOfWork;
import org.kyojo.schemaorg.m3n4.bib.Container.WorkTranslation;
import org.kyojo.schemaorg.m3n4.core.Clazz;
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
import org.kyojo.schemaorg.m3n4.core.Container.ApplicationCategory;
import org.kyojo.schemaorg.m3n4.core.Container.ApplicationSubCategory;
import org.kyojo.schemaorg.m3n4.core.Container.ApplicationSuite;
import org.kyojo.schemaorg.m3n4.core.Container.AssociatedMedia;
import org.kyojo.schemaorg.m3n4.core.Container.Audience;
import org.kyojo.schemaorg.m3n4.core.Container.Audio;
import org.kyojo.schemaorg.m3n4.core.Container.Author;
import org.kyojo.schemaorg.m3n4.core.Container.AvailableOnDevice;
import org.kyojo.schemaorg.m3n4.core.Container.Award;
import org.kyojo.schemaorg.m3n4.core.Container.Character;
import org.kyojo.schemaorg.m3n4.core.Container.CharacterAttribute;
import org.kyojo.schemaorg.m3n4.core.Container.CheatCode;
import org.kyojo.schemaorg.m3n4.core.Container.Citation;
import org.kyojo.schemaorg.m3n4.core.Container.Comment;
import org.kyojo.schemaorg.m3n4.core.Container.CommentCount;
import org.kyojo.schemaorg.m3n4.core.Container.ContentLocation;
import org.kyojo.schemaorg.m3n4.core.Container.ContentRating;
import org.kyojo.schemaorg.m3n4.core.Container.Contributor;
import org.kyojo.schemaorg.m3n4.core.Container.CopyrightHolder;
import org.kyojo.schemaorg.m3n4.core.Container.CopyrightYear;
import org.kyojo.schemaorg.m3n4.core.Container.CountriesNotSupported;
import org.kyojo.schemaorg.m3n4.core.Container.CountriesSupported;
import org.kyojo.schemaorg.m3n4.core.Container.Creator;
import org.kyojo.schemaorg.m3n4.core.Container.DateCreated;
import org.kyojo.schemaorg.m3n4.core.Container.DateModified;
import org.kyojo.schemaorg.m3n4.core.Container.DatePublished;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.Director;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.DiscussionUrl;
import org.kyojo.schemaorg.m3n4.core.Container.DownloadUrl;
import org.kyojo.schemaorg.m3n4.core.Container.Editor;
import org.kyojo.schemaorg.m3n4.core.Container.EducationalAlignment;
import org.kyojo.schemaorg.m3n4.core.Container.EducationalUse;
import org.kyojo.schemaorg.m3n4.core.Container.Encoding;
import org.kyojo.schemaorg.m3n4.core.Container.EncodingFormat;
import org.kyojo.schemaorg.m3n4.core.Container.ExampleOfWork;
import org.kyojo.schemaorg.m3n4.core.Container.Expires;
import org.kyojo.schemaorg.m3n4.core.Container.FeatureList;
import org.kyojo.schemaorg.m3n4.core.Container.FileSize;
import org.kyojo.schemaorg.m3n4.core.Container.Funder;
import org.kyojo.schemaorg.m3n4.core.Container.GameItem;
import org.kyojo.schemaorg.m3n4.core.Container.GameLocation;
import org.kyojo.schemaorg.m3n4.core.Container.GamePlatform;
import org.kyojo.schemaorg.m3n4.core.Container.GameServer;
import org.kyojo.schemaorg.m3n4.core.Container.GameTip;
import org.kyojo.schemaorg.m3n4.core.Container.Genre;
import org.kyojo.schemaorg.m3n4.core.Container.HasPart;
import org.kyojo.schemaorg.m3n4.core.Container.Headline;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.InLanguage;
import org.kyojo.schemaorg.m3n4.core.Container.InstallUrl;
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
import org.kyojo.schemaorg.m3n4.core.Container.MemoryRequirements;
import org.kyojo.schemaorg.m3n4.core.Container.Mentions;
import org.kyojo.schemaorg.m3n4.core.Container.MusicBy;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfPlayers;
import org.kyojo.schemaorg.m3n4.core.Container.Offers;
import org.kyojo.schemaorg.m3n4.core.Container.OperatingSystem;
import org.kyojo.schemaorg.m3n4.core.Container.Permissions;
import org.kyojo.schemaorg.m3n4.core.Container.PlayMode;
import org.kyojo.schemaorg.m3n4.core.Container.Position;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.ProcessorRequirements;
import org.kyojo.schemaorg.m3n4.core.Container.Producer;
import org.kyojo.schemaorg.m3n4.core.Container.Provider;
import org.kyojo.schemaorg.m3n4.core.Container.Publication;
import org.kyojo.schemaorg.m3n4.core.Container.Publisher;
import org.kyojo.schemaorg.m3n4.core.Container.PublishingPrinciples;
import org.kyojo.schemaorg.m3n4.core.Container.Quest;
import org.kyojo.schemaorg.m3n4.core.Container.RecordedAt;
import org.kyojo.schemaorg.m3n4.core.Container.ReleaseNotes;
import org.kyojo.schemaorg.m3n4.core.Container.ReleasedEvent;
import org.kyojo.schemaorg.m3n4.core.Container.Review;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.SchemaVersion;
import org.kyojo.schemaorg.m3n4.core.Container.Screenshot;
import org.kyojo.schemaorg.m3n4.core.Container.SoftwareAddOn;
import org.kyojo.schemaorg.m3n4.core.Container.SoftwareHelp;
import org.kyojo.schemaorg.m3n4.core.Container.SoftwareRequirements;
import org.kyojo.schemaorg.m3n4.core.Container.SoftwareVersion;
import org.kyojo.schemaorg.m3n4.core.Container.SourceOrganization;
import org.kyojo.schemaorg.m3n4.core.Container.SpatialCoverage;
import org.kyojo.schemaorg.m3n4.core.Container.Sponsor;
import org.kyojo.schemaorg.m3n4.core.Container.StorageRequirements;
import org.kyojo.schemaorg.m3n4.core.Container.SupportingData;
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
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Container.ContentReferenceTime;
import org.kyojo.schemaorg.m3n4.pending.Container.Correction;
import org.kyojo.schemaorg.m3n4.pending.Container.SdDatePublished;
import org.kyojo.schemaorg.m3n4.pending.Container.SdLicense;
import org.kyojo.schemaorg.m3n4.pending.Container.SdPublisher;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;

public class VIDEO_GAME implements Clazz.VideoGame {

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
	public About about;
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
	public AggregateRating aggregateRating;
	public AlternateName alternateName;
	public AlternativeHeadline alternativeHeadline;
	public ApplicationCategory applicationCategory;
	public ApplicationSubCategory applicationSubCategory;
	public ApplicationSuite applicationSuite;
	public AssociatedMedia associatedMedia;
	public Audience audience;
	public Audio audio;
	public Author author;
	public AvailableOnDevice availableOnDevice;
	public Award award;
	public Character character;
	public CharacterAttribute characterAttribute;
	public CheatCode cheatCode;
	public Citation citation;
	public Comment comment;
	public CommentCount commentCount;
	public ContentLocation contentLocation;
	public ContentRating contentRating;
	public ContentReferenceTime contentReferenceTime;
	public Contributor contributor;
	public CopyrightHolder copyrightHolder;
	public CopyrightYear copyrightYear;
	public Correction correction;
	public CountriesNotSupported countriesNotSupported;
	public CountriesSupported countriesSupported;
	public Creator creator;
	public DateCreated dateCreated;
	public DateModified dateModified;
	public DatePublished datePublished;
	public Description description;
	public Director director;
	public DisambiguatingDescription disambiguatingDescription;
	public DiscussionUrl discussionUrl;
	public DownloadUrl downloadUrl;
	public Editor editor;
	public EducationalAlignment educationalAlignment;
	public EducationalUse educationalUse;
	public Encoding encoding;
	public EncodingFormat encodingFormat;
	public ExampleOfWork exampleOfWork;
	public Expires expires;
	public FeatureList featureList;
	public FileSize fileSize;
	public Funder funder;
	public GameItem gameItem;
	public GameLocation gameLocation;
	public GamePlatform gamePlatform;
	public GameServer gameServer;
	public GameTip gameTip;
	public Genre genre;
	public HasPart hasPart;
	public Headline headline;
	public Identifier identifier;
	public Image image;
	public InLanguage inLanguage;
	public InstallUrl installUrl;
	public InteractionStatistic interactionStatistic;
	public InteractivityType interactivityType;
	public IsAccessibleForFree isAccessibleForFree;
	public IsBasedOn isBasedOn;
	public IsFamilyFriendly isFamilyFriendly;
	public IsPartOf isPartOf;
	public Keywords keywords;
	public LearningResourceType learningResourceType;
	public License license;
	public LocationCreated locationCreated;
	public MainEntity mainEntity;
	public MainEntityOfPage mainEntityOfPage;
	public Material material;
	public MemoryRequirements memoryRequirements;
	public Mentions mentions;
	public MusicBy musicBy;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public NumberOfPlayers numberOfPlayers;
	public Offers offers;
	public OperatingSystem operatingSystem;
	public Permissions permissions;
	public PlayMode playMode;
	public Position position;
	public PotentialAction potentialAction;
	public ProcessorRequirements processorRequirements;
	public Producer producer;
	public Provider provider;
	public Publication publication;
	public Publisher publisher;
	public PublisherImprint publisherImprint;
	public PublishingPrinciples publishingPrinciples;
	public Quest quest;
	public RecordedAt recordedAt;
	public ReleaseNotes releaseNotes;
	public ReleasedEvent releasedEvent;
	public Review review;
	public SameAs sameAs;
	public SchemaVersion schemaVersion;
	public Screenshot screenshot;
	public SdDatePublished sdDatePublished;
	public SdLicense sdLicense;
	public SdPublisher sdPublisher;
	public SoftwareAddOn softwareAddOn;
	public SoftwareHelp softwareHelp;
	public SoftwareRequirements softwareRequirements;
	public SoftwareVersion softwareVersion;
	public SourceOrganization sourceOrganization;
	public SpatialCoverage spatialCoverage;
	public Sponsor sponsor;
	public StorageRequirements storageRequirements;
	public SubjectOf subjectOf;
	public SupportingData supportingData;
	public TemporalCoverage temporalCoverage;
	public Text text;
	public ThumbnailUrl thumbnailUrl;
	public TimeRequired timeRequired;
	public Trailer trailer;
	public TranslationOfWork translationOfWork;
	public Translator translator;
	public TypicalAgeRange typicalAgeRange;
	public Url url;
	public Version version;
	public Video video;
	public WorkExample workExample;
	public WorkTranslation workTranslation;

	public VIDEO_GAME() {
	}

	public VIDEO_GAME(Long seq) {
		setSeq(seq);
	}

	public VIDEO_GAME(String string) {
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

	public VIDEO_GAME(About about) {
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

	public VIDEO_GAME(AccessMode accessMode) {
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

	public VIDEO_GAME(AccessModeSufficient accessModeSufficient) {
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

	public VIDEO_GAME(AccessibilityAPI accessibilityAPI) {
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

	public VIDEO_GAME(AccessibilityControl accessibilityControl) {
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

	public VIDEO_GAME(AccessibilityFeature accessibilityFeature) {
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

	public VIDEO_GAME(AccessibilityHazard accessibilityHazard) {
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

	public VIDEO_GAME(AccessibilitySummary accessibilitySummary) {
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

	public VIDEO_GAME(AccountablePerson accountablePerson) {
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

	public VIDEO_GAME(Actor actor) {
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

	public VIDEO_GAME(AdditionalType additionalType) {
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

	public VIDEO_GAME(AggregateRating aggregateRating) {
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

	public VIDEO_GAME(AlternateName alternateName) {
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

	public VIDEO_GAME(AlternativeHeadline alternativeHeadline) {
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

	public VIDEO_GAME(ApplicationCategory applicationCategory) {
		setApplicationCategory(applicationCategory);
	}

	@Override
	public ApplicationCategory getApplicationCategory() {
		return applicationCategory;
	}

	@Override
	public void setApplicationCategory(ApplicationCategory applicationCategory) {
		this.applicationCategory = applicationCategory;
	}

	public VIDEO_GAME(ApplicationSubCategory applicationSubCategory) {
		setApplicationSubCategory(applicationSubCategory);
	}

	@Override
	public ApplicationSubCategory getApplicationSubCategory() {
		return applicationSubCategory;
	}

	@Override
	public void setApplicationSubCategory(ApplicationSubCategory applicationSubCategory) {
		this.applicationSubCategory = applicationSubCategory;
	}

	public VIDEO_GAME(ApplicationSuite applicationSuite) {
		setApplicationSuite(applicationSuite);
	}

	@Override
	public ApplicationSuite getApplicationSuite() {
		return applicationSuite;
	}

	@Override
	public void setApplicationSuite(ApplicationSuite applicationSuite) {
		this.applicationSuite = applicationSuite;
	}

	public VIDEO_GAME(AssociatedMedia associatedMedia) {
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

	public VIDEO_GAME(Audience audience) {
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

	public VIDEO_GAME(Audio audio) {
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

	public VIDEO_GAME(Author author) {
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

	public VIDEO_GAME(AvailableOnDevice availableOnDevice) {
		setAvailableOnDevice(availableOnDevice);
	}

	@Override
	public AvailableOnDevice getAvailableOnDevice() {
		return availableOnDevice;
	}

	@Override
	public void setAvailableOnDevice(AvailableOnDevice availableOnDevice) {
		this.availableOnDevice = availableOnDevice;
	}

	public VIDEO_GAME(Award award) {
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

	public VIDEO_GAME(Character character) {
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

	public VIDEO_GAME(CharacterAttribute characterAttribute) {
		setCharacterAttribute(characterAttribute);
	}

	@Override
	public CharacterAttribute getCharacterAttribute() {
		return characterAttribute;
	}

	@Override
	public void setCharacterAttribute(CharacterAttribute characterAttribute) {
		this.characterAttribute = characterAttribute;
	}

	public VIDEO_GAME(CheatCode cheatCode) {
		setCheatCode(cheatCode);
	}

	@Override
	public CheatCode getCheatCode() {
		return cheatCode;
	}

	@Override
	public void setCheatCode(CheatCode cheatCode) {
		this.cheatCode = cheatCode;
	}

	public VIDEO_GAME(Citation citation) {
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

	public VIDEO_GAME(Comment comment) {
		setComment(comment);
	}

	@Override
	public Comment getComment() {
		return comment;
	}

	@Override
	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public VIDEO_GAME(CommentCount commentCount) {
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

	public VIDEO_GAME(ContentLocation contentLocation) {
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

	public VIDEO_GAME(ContentRating contentRating) {
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

	public VIDEO_GAME(ContentReferenceTime contentReferenceTime) {
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

	public VIDEO_GAME(Contributor contributor) {
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

	public VIDEO_GAME(CopyrightHolder copyrightHolder) {
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

	public VIDEO_GAME(CopyrightYear copyrightYear) {
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

	public VIDEO_GAME(Correction correction) {
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

	public VIDEO_GAME(CountriesNotSupported countriesNotSupported) {
		setCountriesNotSupported(countriesNotSupported);
	}

	@Override
	public CountriesNotSupported getCountriesNotSupported() {
		return countriesNotSupported;
	}

	@Override
	public void setCountriesNotSupported(CountriesNotSupported countriesNotSupported) {
		this.countriesNotSupported = countriesNotSupported;
	}

	public VIDEO_GAME(CountriesSupported countriesSupported) {
		setCountriesSupported(countriesSupported);
	}

	@Override
	public CountriesSupported getCountriesSupported() {
		return countriesSupported;
	}

	@Override
	public void setCountriesSupported(CountriesSupported countriesSupported) {
		this.countriesSupported = countriesSupported;
	}

	public VIDEO_GAME(Creator creator) {
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

	public VIDEO_GAME(DateCreated dateCreated) {
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

	public VIDEO_GAME(DateModified dateModified) {
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

	public VIDEO_GAME(DatePublished datePublished) {
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

	public VIDEO_GAME(Description description) {
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

	public VIDEO_GAME(Director director) {
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

	public VIDEO_GAME(DisambiguatingDescription disambiguatingDescription) {
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

	public VIDEO_GAME(DiscussionUrl discussionUrl) {
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

	public VIDEO_GAME(DownloadUrl downloadUrl) {
		setDownloadUrl(downloadUrl);
	}

	@Override
	public DownloadUrl getDownloadUrl() {
		return downloadUrl;
	}

	@Override
	public void setDownloadUrl(DownloadUrl downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public VIDEO_GAME(Editor editor) {
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

	public VIDEO_GAME(EducationalAlignment educationalAlignment) {
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

	public VIDEO_GAME(EducationalUse educationalUse) {
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

	public VIDEO_GAME(Encoding encoding) {
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

	public VIDEO_GAME(EncodingFormat encodingFormat) {
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

	public VIDEO_GAME(ExampleOfWork exampleOfWork) {
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

	public VIDEO_GAME(Expires expires) {
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

	public VIDEO_GAME(FeatureList featureList) {
		setFeatureList(featureList);
	}

	@Override
	public FeatureList getFeatureList() {
		return featureList;
	}

	@Override
	public void setFeatureList(FeatureList featureList) {
		this.featureList = featureList;
	}

	public VIDEO_GAME(FileSize fileSize) {
		setFileSize(fileSize);
	}

	@Override
	public FileSize getFileSize() {
		return fileSize;
	}

	@Override
	public void setFileSize(FileSize fileSize) {
		this.fileSize = fileSize;
	}

	public VIDEO_GAME(Funder funder) {
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

	public VIDEO_GAME(GameItem gameItem) {
		setGameItem(gameItem);
	}

	@Override
	public GameItem getGameItem() {
		return gameItem;
	}

	@Override
	public void setGameItem(GameItem gameItem) {
		this.gameItem = gameItem;
	}

	public VIDEO_GAME(GameLocation gameLocation) {
		setGameLocation(gameLocation);
	}

	@Override
	public GameLocation getGameLocation() {
		return gameLocation;
	}

	@Override
	public void setGameLocation(GameLocation gameLocation) {
		this.gameLocation = gameLocation;
	}

	public VIDEO_GAME(GamePlatform gamePlatform) {
		setGamePlatform(gamePlatform);
	}

	@Override
	public GamePlatform getGamePlatform() {
		return gamePlatform;
	}

	@Override
	public void setGamePlatform(GamePlatform gamePlatform) {
		this.gamePlatform = gamePlatform;
	}

	public VIDEO_GAME(GameServer gameServer) {
		setGameServer(gameServer);
	}

	@Override
	public GameServer getGameServer() {
		return gameServer;
	}

	@Override
	public void setGameServer(GameServer gameServer) {
		this.gameServer = gameServer;
	}

	public VIDEO_GAME(GameTip gameTip) {
		setGameTip(gameTip);
	}

	@Override
	public GameTip getGameTip() {
		return gameTip;
	}

	@Override
	public void setGameTip(GameTip gameTip) {
		this.gameTip = gameTip;
	}

	public VIDEO_GAME(Genre genre) {
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

	public VIDEO_GAME(HasPart hasPart) {
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

	public VIDEO_GAME(Headline headline) {
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

	public VIDEO_GAME(Identifier identifier) {
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

	public VIDEO_GAME(Image image) {
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

	public VIDEO_GAME(InLanguage inLanguage) {
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

	public VIDEO_GAME(InstallUrl installUrl) {
		setInstallUrl(installUrl);
	}

	@Override
	public InstallUrl getInstallUrl() {
		return installUrl;
	}

	@Override
	public void setInstallUrl(InstallUrl installUrl) {
		this.installUrl = installUrl;
	}

	public VIDEO_GAME(InteractionStatistic interactionStatistic) {
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

	public VIDEO_GAME(InteractivityType interactivityType) {
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

	public VIDEO_GAME(IsAccessibleForFree isAccessibleForFree) {
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

	public VIDEO_GAME(IsBasedOn isBasedOn) {
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

	public VIDEO_GAME(IsFamilyFriendly isFamilyFriendly) {
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

	public VIDEO_GAME(IsPartOf isPartOf) {
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

	public VIDEO_GAME(Keywords keywords) {
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

	public VIDEO_GAME(LearningResourceType learningResourceType) {
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

	public VIDEO_GAME(License license) {
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

	public VIDEO_GAME(LocationCreated locationCreated) {
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

	public VIDEO_GAME(MainEntity mainEntity) {
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

	public VIDEO_GAME(MainEntityOfPage mainEntityOfPage) {
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

	public VIDEO_GAME(Material material) {
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

	public VIDEO_GAME(MemoryRequirements memoryRequirements) {
		setMemoryRequirements(memoryRequirements);
	}

	@Override
	public MemoryRequirements getMemoryRequirements() {
		return memoryRequirements;
	}

	@Override
	public void setMemoryRequirements(MemoryRequirements memoryRequirements) {
		this.memoryRequirements = memoryRequirements;
	}

	public VIDEO_GAME(Mentions mentions) {
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

	public VIDEO_GAME(MusicBy musicBy) {
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

	public VIDEO_GAME(Name name) {
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

	public VIDEO_GAME(NameFuzzy nameFuzzy) {
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

	public VIDEO_GAME(NameRuby nameRuby) {
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

	public VIDEO_GAME(NumberOfPlayers numberOfPlayers) {
		setNumberOfPlayers(numberOfPlayers);
	}

	@Override
	public NumberOfPlayers getNumberOfPlayers() {
		return numberOfPlayers;
	}

	@Override
	public void setNumberOfPlayers(NumberOfPlayers numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public VIDEO_GAME(Offers offers) {
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

	public VIDEO_GAME(OperatingSystem operatingSystem) {
		setOperatingSystem(operatingSystem);
	}

	@Override
	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}

	@Override
	public void setOperatingSystem(OperatingSystem operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public VIDEO_GAME(Permissions permissions) {
		setPermissions(permissions);
	}

	@Override
	public Permissions getPermissions() {
		return permissions;
	}

	@Override
	public void setPermissions(Permissions permissions) {
		this.permissions = permissions;
	}

	public VIDEO_GAME(PlayMode playMode) {
		setPlayMode(playMode);
	}

	@Override
	public PlayMode getPlayMode() {
		return playMode;
	}

	@Override
	public void setPlayMode(PlayMode playMode) {
		this.playMode = playMode;
	}

	public VIDEO_GAME(Position position) {
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

	public VIDEO_GAME(PotentialAction potentialAction) {
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

	public VIDEO_GAME(ProcessorRequirements processorRequirements) {
		setProcessorRequirements(processorRequirements);
	}

	@Override
	public ProcessorRequirements getProcessorRequirements() {
		return processorRequirements;
	}

	@Override
	public void setProcessorRequirements(ProcessorRequirements processorRequirements) {
		this.processorRequirements = processorRequirements;
	}

	public VIDEO_GAME(Producer producer) {
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

	public VIDEO_GAME(Provider provider) {
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

	public VIDEO_GAME(Publication publication) {
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

	public VIDEO_GAME(Publisher publisher) {
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

	public VIDEO_GAME(PublisherImprint publisherImprint) {
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

	public VIDEO_GAME(PublishingPrinciples publishingPrinciples) {
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

	public VIDEO_GAME(Quest quest) {
		setQuest(quest);
	}

	@Override
	public Quest getQuest() {
		return quest;
	}

	@Override
	public void setQuest(Quest quest) {
		this.quest = quest;
	}

	public VIDEO_GAME(RecordedAt recordedAt) {
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

	public VIDEO_GAME(ReleaseNotes releaseNotes) {
		setReleaseNotes(releaseNotes);
	}

	@Override
	public ReleaseNotes getReleaseNotes() {
		return releaseNotes;
	}

	@Override
	public void setReleaseNotes(ReleaseNotes releaseNotes) {
		this.releaseNotes = releaseNotes;
	}

	public VIDEO_GAME(ReleasedEvent releasedEvent) {
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

	public VIDEO_GAME(Review review) {
		setReview(review);
	}

	@Override
	public Review getReview() {
		return review;
	}

	@Override
	public void setReview(Review review) {
		this.review = review;
	}

	public VIDEO_GAME(SameAs sameAs) {
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

	public VIDEO_GAME(SchemaVersion schemaVersion) {
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

	public VIDEO_GAME(Screenshot screenshot) {
		setScreenshot(screenshot);
	}

	@Override
	public Screenshot getScreenshot() {
		return screenshot;
	}

	@Override
	public void setScreenshot(Screenshot screenshot) {
		this.screenshot = screenshot;
	}

	public VIDEO_GAME(SdDatePublished sdDatePublished) {
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

	public VIDEO_GAME(SdLicense sdLicense) {
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

	public VIDEO_GAME(SdPublisher sdPublisher) {
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

	public VIDEO_GAME(SoftwareAddOn softwareAddOn) {
		setSoftwareAddOn(softwareAddOn);
	}

	@Override
	public SoftwareAddOn getSoftwareAddOn() {
		return softwareAddOn;
	}

	@Override
	public void setSoftwareAddOn(SoftwareAddOn softwareAddOn) {
		this.softwareAddOn = softwareAddOn;
	}

	public VIDEO_GAME(SoftwareHelp softwareHelp) {
		setSoftwareHelp(softwareHelp);
	}

	@Override
	public SoftwareHelp getSoftwareHelp() {
		return softwareHelp;
	}

	@Override
	public void setSoftwareHelp(SoftwareHelp softwareHelp) {
		this.softwareHelp = softwareHelp;
	}

	public VIDEO_GAME(SoftwareRequirements softwareRequirements) {
		setSoftwareRequirements(softwareRequirements);
	}

	@Override
	public SoftwareRequirements getSoftwareRequirements() {
		return softwareRequirements;
	}

	@Override
	public void setSoftwareRequirements(SoftwareRequirements softwareRequirements) {
		this.softwareRequirements = softwareRequirements;
	}

	public VIDEO_GAME(SoftwareVersion softwareVersion) {
		setSoftwareVersion(softwareVersion);
	}

	@Override
	public SoftwareVersion getSoftwareVersion() {
		return softwareVersion;
	}

	@Override
	public void setSoftwareVersion(SoftwareVersion softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	public VIDEO_GAME(SourceOrganization sourceOrganization) {
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

	public VIDEO_GAME(SpatialCoverage spatialCoverage) {
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

	public VIDEO_GAME(Sponsor sponsor) {
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

	public VIDEO_GAME(StorageRequirements storageRequirements) {
		setStorageRequirements(storageRequirements);
	}

	@Override
	public StorageRequirements getStorageRequirements() {
		return storageRequirements;
	}

	@Override
	public void setStorageRequirements(StorageRequirements storageRequirements) {
		this.storageRequirements = storageRequirements;
	}

	public VIDEO_GAME(SubjectOf subjectOf) {
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

	public VIDEO_GAME(SupportingData supportingData) {
		setSupportingData(supportingData);
	}

	@Override
	public SupportingData getSupportingData() {
		return supportingData;
	}

	@Override
	public void setSupportingData(SupportingData supportingData) {
		this.supportingData = supportingData;
	}

	public VIDEO_GAME(TemporalCoverage temporalCoverage) {
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

	public VIDEO_GAME(Text text) {
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

	public VIDEO_GAME(ThumbnailUrl thumbnailUrl) {
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

	public VIDEO_GAME(TimeRequired timeRequired) {
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

	public VIDEO_GAME(Trailer trailer) {
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

	public VIDEO_GAME(TranslationOfWork translationOfWork) {
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

	public VIDEO_GAME(Translator translator) {
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

	public VIDEO_GAME(TypicalAgeRange typicalAgeRange) {
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

	public VIDEO_GAME(Url url) {
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

	public VIDEO_GAME(Version version) {
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

	public VIDEO_GAME(Video video) {
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

	public VIDEO_GAME(WorkExample workExample) {
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

	public VIDEO_GAME(WorkTranslation workTranslation) {
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

	public VIDEO_GAME(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			About about,
			AccessMode accessMode,
			AccessModeSufficient accessModeSufficient,
			AccessibilityAPI accessibilityAPI,
			AccessibilityControl accessibilityControl,
			AccessibilityFeature accessibilityFeature,
			AccessibilityHazard accessibilityHazard,
			AccessibilitySummary accessibilitySummary,
			AccountablePerson accountablePerson,
			Actor actor,
			AdditionalType additionalType,
			AggregateRating aggregateRating,
			AlternateName alternateName,
			AlternativeHeadline alternativeHeadline,
			ApplicationCategory applicationCategory,
			ApplicationSubCategory applicationSubCategory,
			ApplicationSuite applicationSuite,
			AssociatedMedia associatedMedia,
			Audience audience,
			Audio audio,
			Author author,
			AvailableOnDevice availableOnDevice,
			Award award,
			Character character,
			CharacterAttribute characterAttribute,
			CheatCode cheatCode,
			Citation citation,
			Comment comment,
			CommentCount commentCount,
			ContentLocation contentLocation,
			ContentRating contentRating,
			ContentReferenceTime contentReferenceTime,
			Contributor contributor,
			CopyrightHolder copyrightHolder,
			CopyrightYear copyrightYear,
			Correction correction,
			CountriesNotSupported countriesNotSupported,
			CountriesSupported countriesSupported,
			Creator creator,
			DateCreated dateCreated,
			DateModified dateModified,
			DatePublished datePublished,
			Description description,
			Director director,
			DisambiguatingDescription disambiguatingDescription,
			DiscussionUrl discussionUrl,
			DownloadUrl downloadUrl,
			Editor editor,
			EducationalAlignment educationalAlignment,
			EducationalUse educationalUse,
			Encoding encoding,
			EncodingFormat encodingFormat,
			ExampleOfWork exampleOfWork,
			Expires expires,
			FeatureList featureList,
			FileSize fileSize,
			Funder funder,
			GameItem gameItem,
			GameLocation gameLocation,
			GamePlatform gamePlatform,
			GameServer gameServer,
			GameTip gameTip,
			Genre genre,
			HasPart hasPart,
			Headline headline,
			Identifier identifier,
			Image image,
			InLanguage inLanguage,
			InstallUrl installUrl,
			InteractionStatistic interactionStatistic,
			InteractivityType interactivityType,
			IsAccessibleForFree isAccessibleForFree,
			IsBasedOn isBasedOn,
			IsFamilyFriendly isFamilyFriendly,
			IsPartOf isPartOf,
			Keywords keywords,
			LearningResourceType learningResourceType,
			License license,
			LocationCreated locationCreated,
			MainEntity mainEntity,
			MainEntityOfPage mainEntityOfPage,
			Material material,
			MemoryRequirements memoryRequirements,
			Mentions mentions,
			MusicBy musicBy,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			NumberOfPlayers numberOfPlayers,
			Offers offers,
			OperatingSystem operatingSystem,
			Permissions permissions,
			PlayMode playMode,
			Position position,
			PotentialAction potentialAction,
			ProcessorRequirements processorRequirements,
			Producer producer,
			Provider provider,
			Publication publication,
			Publisher publisher,
			PublisherImprint publisherImprint,
			PublishingPrinciples publishingPrinciples,
			Quest quest,
			RecordedAt recordedAt,
			ReleaseNotes releaseNotes,
			ReleasedEvent releasedEvent,
			Review review,
			SameAs sameAs,
			SchemaVersion schemaVersion,
			Screenshot screenshot,
			SdDatePublished sdDatePublished,
			SdLicense sdLicense,
			SdPublisher sdPublisher,
			SoftwareAddOn softwareAddOn,
			SoftwareHelp softwareHelp,
			SoftwareRequirements softwareRequirements,
			SoftwareVersion softwareVersion,
			SourceOrganization sourceOrganization,
			SpatialCoverage spatialCoverage,
			Sponsor sponsor,
			StorageRequirements storageRequirements,
			SubjectOf subjectOf,
			SupportingData supportingData,
			TemporalCoverage temporalCoverage,
			Text text,
			ThumbnailUrl thumbnailUrl,
			TimeRequired timeRequired,
			Trailer trailer,
			TranslationOfWork translationOfWork,
			Translator translator,
			TypicalAgeRange typicalAgeRange,
			Url url,
			Version version,
			Video video,
			WorkExample workExample,
			WorkTranslation workTranslation) {
		setSeq(seq);
		setRefSeq(refSeq);
		setRefAcr(refAcr);
		setCreatedAt(createdAt);
		setCreatedBy(createdBy);
		setUpdatedAt(updatedAt);
		setUpdatedBy(updatedBy);
		setExpiredAt(expiredAt);
		setExpiredBy(expiredBy);
		setAbout(about);
		setAccessMode(accessMode);
		setAccessModeSufficient(accessModeSufficient);
		setAccessibilityAPI(accessibilityAPI);
		setAccessibilityControl(accessibilityControl);
		setAccessibilityFeature(accessibilityFeature);
		setAccessibilityHazard(accessibilityHazard);
		setAccessibilitySummary(accessibilitySummary);
		setAccountablePerson(accountablePerson);
		setActor(actor);
		setAdditionalType(additionalType);
		setAggregateRating(aggregateRating);
		setAlternateName(alternateName);
		setAlternativeHeadline(alternativeHeadline);
		setApplicationCategory(applicationCategory);
		setApplicationSubCategory(applicationSubCategory);
		setApplicationSuite(applicationSuite);
		setAssociatedMedia(associatedMedia);
		setAudience(audience);
		setAudio(audio);
		setAuthor(author);
		setAvailableOnDevice(availableOnDevice);
		setAward(award);
		setCharacter(character);
		setCharacterAttribute(characterAttribute);
		setCheatCode(cheatCode);
		setCitation(citation);
		setComment(comment);
		setCommentCount(commentCount);
		setContentLocation(contentLocation);
		setContentRating(contentRating);
		setContentReferenceTime(contentReferenceTime);
		setContributor(contributor);
		setCopyrightHolder(copyrightHolder);
		setCopyrightYear(copyrightYear);
		setCorrection(correction);
		setCountriesNotSupported(countriesNotSupported);
		setCountriesSupported(countriesSupported);
		setCreator(creator);
		setDateCreated(dateCreated);
		setDateModified(dateModified);
		setDatePublished(datePublished);
		setDescription(description);
		setDirector(director);
		setDisambiguatingDescription(disambiguatingDescription);
		setDiscussionUrl(discussionUrl);
		setDownloadUrl(downloadUrl);
		setEditor(editor);
		setEducationalAlignment(educationalAlignment);
		setEducationalUse(educationalUse);
		setEncoding(encoding);
		setEncodingFormat(encodingFormat);
		setExampleOfWork(exampleOfWork);
		setExpires(expires);
		setFeatureList(featureList);
		setFileSize(fileSize);
		setFunder(funder);
		setGameItem(gameItem);
		setGameLocation(gameLocation);
		setGamePlatform(gamePlatform);
		setGameServer(gameServer);
		setGameTip(gameTip);
		setGenre(genre);
		setHasPart(hasPart);
		setHeadline(headline);
		setIdentifier(identifier);
		setImage(image);
		setInLanguage(inLanguage);
		setInstallUrl(installUrl);
		setInteractionStatistic(interactionStatistic);
		setInteractivityType(interactivityType);
		setIsAccessibleForFree(isAccessibleForFree);
		setIsBasedOn(isBasedOn);
		setIsFamilyFriendly(isFamilyFriendly);
		setIsPartOf(isPartOf);
		setKeywords(keywords);
		setLearningResourceType(learningResourceType);
		setLicense(license);
		setLocationCreated(locationCreated);
		setMainEntity(mainEntity);
		setMainEntityOfPage(mainEntityOfPage);
		setMaterial(material);
		setMemoryRequirements(memoryRequirements);
		setMentions(mentions);
		setMusicBy(musicBy);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setNumberOfPlayers(numberOfPlayers);
		setOffers(offers);
		setOperatingSystem(operatingSystem);
		setPermissions(permissions);
		setPlayMode(playMode);
		setPosition(position);
		setPotentialAction(potentialAction);
		setProcessorRequirements(processorRequirements);
		setProducer(producer);
		setProvider(provider);
		setPublication(publication);
		setPublisher(publisher);
		setPublisherImprint(publisherImprint);
		setPublishingPrinciples(publishingPrinciples);
		setQuest(quest);
		setRecordedAt(recordedAt);
		setReleaseNotes(releaseNotes);
		setReleasedEvent(releasedEvent);
		setReview(review);
		setSameAs(sameAs);
		setSchemaVersion(schemaVersion);
		setScreenshot(screenshot);
		setSdDatePublished(sdDatePublished);
		setSdLicense(sdLicense);
		setSdPublisher(sdPublisher);
		setSoftwareAddOn(softwareAddOn);
		setSoftwareHelp(softwareHelp);
		setSoftwareRequirements(softwareRequirements);
		setSoftwareVersion(softwareVersion);
		setSourceOrganization(sourceOrganization);
		setSpatialCoverage(spatialCoverage);
		setSponsor(sponsor);
		setStorageRequirements(storageRequirements);
		setSubjectOf(subjectOf);
		setSupportingData(supportingData);
		setTemporalCoverage(temporalCoverage);
		setText(text);
		setThumbnailUrl(thumbnailUrl);
		setTimeRequired(timeRequired);
		setTrailer(trailer);
		setTranslationOfWork(translationOfWork);
		setTranslator(translator);
		setTypicalAgeRange(typicalAgeRange);
		setUrl(url);
		setVersion(version);
		setVideo(video);
		setWorkExample(workExample);
		setWorkTranslation(workTranslation);
	}

	public void copy(Clazz.VideoGame org) {
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
		setApplicationCategory(org.getApplicationCategory());
		setApplicationSubCategory(org.getApplicationSubCategory());
		setApplicationSuite(org.getApplicationSuite());
		setAssociatedMedia(org.getAssociatedMedia());
		setAudience(org.getAudience());
		setAudio(org.getAudio());
		setAuthor(org.getAuthor());
		setAvailableOnDevice(org.getAvailableOnDevice());
		setAward(org.getAward());
		setCharacter(org.getCharacter());
		setCharacterAttribute(org.getCharacterAttribute());
		setCheatCode(org.getCheatCode());
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
		setCountriesNotSupported(org.getCountriesNotSupported());
		setCountriesSupported(org.getCountriesSupported());
		setCreator(org.getCreator());
		setDateCreated(org.getDateCreated());
		setDateModified(org.getDateModified());
		setDatePublished(org.getDatePublished());
		setDescription(org.getDescription());
		setDirector(org.getDirector());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDiscussionUrl(org.getDiscussionUrl());
		setDownloadUrl(org.getDownloadUrl());
		setEditor(org.getEditor());
		setEducationalAlignment(org.getEducationalAlignment());
		setEducationalUse(org.getEducationalUse());
		setEncoding(org.getEncoding());
		setEncodingFormat(org.getEncodingFormat());
		setExampleOfWork(org.getExampleOfWork());
		setExpires(org.getExpires());
		setFeatureList(org.getFeatureList());
		setFileSize(org.getFileSize());
		setFunder(org.getFunder());
		setGameItem(org.getGameItem());
		setGameLocation(org.getGameLocation());
		setGamePlatform(org.getGamePlatform());
		setGameServer(org.getGameServer());
		setGameTip(org.getGameTip());
		setGenre(org.getGenre());
		setHasPart(org.getHasPart());
		setHeadline(org.getHeadline());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setInLanguage(org.getInLanguage());
		setInstallUrl(org.getInstallUrl());
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
		setMemoryRequirements(org.getMemoryRequirements());
		setMentions(org.getMentions());
		setMusicBy(org.getMusicBy());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setNumberOfPlayers(org.getNumberOfPlayers());
		setOffers(org.getOffers());
		setOperatingSystem(org.getOperatingSystem());
		setPermissions(org.getPermissions());
		setPlayMode(org.getPlayMode());
		setPosition(org.getPosition());
		setPotentialAction(org.getPotentialAction());
		setProcessorRequirements(org.getProcessorRequirements());
		setProducer(org.getProducer());
		setProvider(org.getProvider());
		setPublication(org.getPublication());
		setPublisher(org.getPublisher());
		setPublisherImprint(org.getPublisherImprint());
		setPublishingPrinciples(org.getPublishingPrinciples());
		setQuest(org.getQuest());
		setRecordedAt(org.getRecordedAt());
		setReleaseNotes(org.getReleaseNotes());
		setReleasedEvent(org.getReleasedEvent());
		setReview(org.getReview());
		setSameAs(org.getSameAs());
		setSchemaVersion(org.getSchemaVersion());
		setScreenshot(org.getScreenshot());
		setSdDatePublished(org.getSdDatePublished());
		setSdLicense(org.getSdLicense());
		setSdPublisher(org.getSdPublisher());
		setSoftwareAddOn(org.getSoftwareAddOn());
		setSoftwareHelp(org.getSoftwareHelp());
		setSoftwareRequirements(org.getSoftwareRequirements());
		setSoftwareVersion(org.getSoftwareVersion());
		setSourceOrganization(org.getSourceOrganization());
		setSpatialCoverage(org.getSpatialCoverage());
		setSponsor(org.getSponsor());
		setStorageRequirements(org.getStorageRequirements());
		setSubjectOf(org.getSubjectOf());
		setSupportingData(org.getSupportingData());
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
