package org.kyojo.schemaorg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.bib.Container.PublisherImprint;
import org.kyojo.schemaorg.m3n3.bib.Container.TranslationOfWork;
import org.kyojo.schemaorg.m3n3.bib.Container.WorkTranslation;
import org.kyojo.schemaorg.m3n3.core.Container.About;
import org.kyojo.schemaorg.m3n3.core.Container.AccessMode;
import org.kyojo.schemaorg.m3n3.core.Container.AccessModeSufficient;
import org.kyojo.schemaorg.m3n3.core.Container.AccessibilityAPI;
import org.kyojo.schemaorg.m3n3.core.Container.AccessibilityControl;
import org.kyojo.schemaorg.m3n3.core.Container.AccessibilityFeature;
import org.kyojo.schemaorg.m3n3.core.Container.AccessibilityHazard;
import org.kyojo.schemaorg.m3n3.core.Container.AccessibilitySummary;
import org.kyojo.schemaorg.m3n3.core.Container.AccountablePerson;
import org.kyojo.schemaorg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n3.core.Container.AggregateRating;
import org.kyojo.schemaorg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n3.core.Container.AlternativeHeadline;
import org.kyojo.schemaorg.m3n3.core.Container.AssociatedArticle;
import org.kyojo.schemaorg.m3n3.core.Container.AssociatedMedia;
import org.kyojo.schemaorg.m3n3.core.Container.Audience;
import org.kyojo.schemaorg.m3n3.core.Container.Audio;
import org.kyojo.schemaorg.m3n3.core.Container.Author;
import org.kyojo.schemaorg.m3n3.core.Container.Award;
import org.kyojo.schemaorg.m3n3.core.Container.Bitrate;
import org.kyojo.schemaorg.m3n3.core.Container.Character;
import org.kyojo.schemaorg.m3n3.core.Container.Citation;
import org.kyojo.schemaorg.m3n3.core.Container.Comment;
import org.kyojo.schemaorg.m3n3.core.Container.CommentCount;
import org.kyojo.schemaorg.m3n3.core.Container.ContentLocation;
import org.kyojo.schemaorg.m3n3.core.Container.ContentRating;
import org.kyojo.schemaorg.m3n3.core.Container.ContentSize;
import org.kyojo.schemaorg.m3n3.core.Container.ContentUrl;
import org.kyojo.schemaorg.m3n3.core.Container.Contributor;
import org.kyojo.schemaorg.m3n3.core.Container.CopyrightHolder;
import org.kyojo.schemaorg.m3n3.core.Container.CopyrightYear;
import org.kyojo.schemaorg.m3n3.core.Container.Creator;
import org.kyojo.schemaorg.m3n3.core.Container.DateCreated;
import org.kyojo.schemaorg.m3n3.core.Container.DateModified;
import org.kyojo.schemaorg.m3n3.core.Container.DatePublished;
import org.kyojo.schemaorg.m3n3.core.Container.Description;
import org.kyojo.schemaorg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n3.core.Container.DiscussionUrl;
import org.kyojo.schemaorg.m3n3.core.Container.Duration;
import org.kyojo.schemaorg.m3n3.core.Container.Editor;
import org.kyojo.schemaorg.m3n3.core.Container.EducationalAlignment;
import org.kyojo.schemaorg.m3n3.core.Container.EducationalUse;
import org.kyojo.schemaorg.m3n3.core.Container.EmbedUrl;
import org.kyojo.schemaorg.m3n3.core.Container.EncodesCreativeWork;
import org.kyojo.schemaorg.m3n3.core.Container.Encoding;
import org.kyojo.schemaorg.m3n3.core.Container.EncodingFormat;
import org.kyojo.schemaorg.m3n3.core.Container.ExampleOfWork;
import org.kyojo.schemaorg.m3n3.core.Container.Expires;
import org.kyojo.schemaorg.m3n3.core.Container.FileFormat;
import org.kyojo.schemaorg.m3n3.core.Container.Funder;
import org.kyojo.schemaorg.m3n3.core.Container.Genre;
import org.kyojo.schemaorg.m3n3.core.Container.HasPart;
import org.kyojo.schemaorg.m3n3.core.Container.Headline;
import org.kyojo.schemaorg.m3n3.core.Container.Height;
import org.kyojo.schemaorg.m3n3.core.Container.Identifier;
import org.kyojo.schemaorg.m3n3.core.Container.Image;
import org.kyojo.schemaorg.m3n3.core.Container.InLanguage;
import org.kyojo.schemaorg.m3n3.core.Container.InteractionStatistic;
import org.kyojo.schemaorg.m3n3.core.Container.InteractivityType;
import org.kyojo.schemaorg.m3n3.core.Container.IsAccessibleForFree;
import org.kyojo.schemaorg.m3n3.core.Container.IsBasedOn;
import org.kyojo.schemaorg.m3n3.core.Container.IsFamilyFriendly;
import org.kyojo.schemaorg.m3n3.core.Container.IsPartOf;
import org.kyojo.schemaorg.m3n3.core.Container.Keywords;
import org.kyojo.schemaorg.m3n3.core.Container.LearningResourceType;
import org.kyojo.schemaorg.m3n3.core.Container.License;
import org.kyojo.schemaorg.m3n3.core.Container.LocationCreated;
import org.kyojo.schemaorg.m3n3.core.Container.MainEntity;
import org.kyojo.schemaorg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n3.core.Container.Material;
import org.kyojo.schemaorg.m3n3.core.Container.Mentions;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n3.core.Container.Offers;
import org.kyojo.schemaorg.m3n3.core.Container.PlayerType;
import org.kyojo.schemaorg.m3n3.core.Container.Position;
import org.kyojo.schemaorg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n3.core.Container.Producer;
import org.kyojo.schemaorg.m3n3.core.Container.ProductionCompany;
import org.kyojo.schemaorg.m3n3.core.Container.Provider;
import org.kyojo.schemaorg.m3n3.core.Container.Publication;
import org.kyojo.schemaorg.m3n3.core.Container.Publisher;
import org.kyojo.schemaorg.m3n3.core.Container.PublishingPrinciples;
import org.kyojo.schemaorg.m3n3.core.Container.RecordedAt;
import org.kyojo.schemaorg.m3n3.core.Container.RegionsAllowed;
import org.kyojo.schemaorg.m3n3.core.Container.ReleasedEvent;
import org.kyojo.schemaorg.m3n3.core.Container.RequiresSubscription;
import org.kyojo.schemaorg.m3n3.core.Container.Review;
import org.kyojo.schemaorg.m3n3.core.Container.SameAs;
import org.kyojo.schemaorg.m3n3.core.Container.SchemaVersion;
import org.kyojo.schemaorg.m3n3.core.Container.SourceOrganization;
import org.kyojo.schemaorg.m3n3.core.Container.SpatialCoverage;
import org.kyojo.schemaorg.m3n3.core.Container.Sponsor;
import org.kyojo.schemaorg.m3n3.core.Container.TemporalCoverage;
import org.kyojo.schemaorg.m3n3.core.Container.Text;
import org.kyojo.schemaorg.m3n3.core.Container.ThumbnailUrl;
import org.kyojo.schemaorg.m3n3.core.Container.TimeRequired;
import org.kyojo.schemaorg.m3n3.core.Container.Translator;
import org.kyojo.schemaorg.m3n3.core.Container.TypicalAgeRange;
import org.kyojo.schemaorg.m3n3.core.Container.UploadDate;
import org.kyojo.schemaorg.m3n3.core.Container.Url;
import org.kyojo.schemaorg.m3n3.core.Container.Version;
import org.kyojo.schemaorg.m3n3.core.Container.Video;
import org.kyojo.schemaorg.m3n3.core.Container.Width;
import org.kyojo.schemaorg.m3n3.core.Container.WorkExample;
import org.kyojo.schemaorg.m3n3.core.DataType;
import org.kyojo.schemaorg.m3n3.core.impl.NAME;
import org.kyojo.schemaorg.m3n3.core.impl.TEXT;
import org.kyojo.schemaorg.m3n3.pending.Clazz;
import org.kyojo.schemaorg.m3n3.pending.Container.ContentReferenceTime;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationAppliedBy;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationApplies;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationChangedBy;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationChanges;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationConsolidatedBy;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationConsolidates;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationDate;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationDateVersion;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationIdentifier;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationLegalForce;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationLegalValue;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationPassedBy;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationResponsible;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationTransposedBy;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationTransposes;
import org.kyojo.schemaorg.m3n3.pending.Container.LegislationType;

public class LEGISLATION_OBJECT implements Clazz.LegislationObject {

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
	public AdditionalType additionalType;
	public AggregateRating aggregateRating;
	public AlternateName alternateName;
	public AlternativeHeadline alternativeHeadline;
	public AssociatedArticle associatedArticle;
	public AssociatedMedia associatedMedia;
	public Audience audience;
	public Audio audio;
	public Author author;
	public Award award;
	public Bitrate bitrate;
	public Character character;
	public Citation citation;
	public Comment comment;
	public CommentCount commentCount;
	public ContentLocation contentLocation;
	public ContentRating contentRating;
	public ContentReferenceTime contentReferenceTime;
	public ContentSize contentSize;
	public ContentUrl contentUrl;
	public Contributor contributor;
	public CopyrightHolder copyrightHolder;
	public CopyrightYear copyrightYear;
	public Creator creator;
	public DateCreated dateCreated;
	public DateModified dateModified;
	public DatePublished datePublished;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public DiscussionUrl discussionUrl;
	public Duration duration;
	public Editor editor;
	public EducationalAlignment educationalAlignment;
	public EducationalUse educationalUse;
	public EmbedUrl embedUrl;
	public EncodesCreativeWork encodesCreativeWork;
	public Encoding encoding;
	public EncodingFormat encodingFormat;
	public ExampleOfWork exampleOfWork;
	public Expires expires;
	public FileFormat fileFormat;
	public Funder funder;
	public Genre genre;
	public HasPart hasPart;
	public Headline headline;
	public Height height;
	public Identifier identifier;
	public Image image;
	public InLanguage inLanguage;
	public InteractionStatistic interactionStatistic;
	public InteractivityType interactivityType;
	public IsAccessibleForFree isAccessibleForFree;
	public IsBasedOn isBasedOn;
	public IsFamilyFriendly isFamilyFriendly;
	public IsPartOf isPartOf;
	public Keywords keywords;
	public LearningResourceType learningResourceType;
	public LegislationAppliedBy legislationAppliedBy;
	public LegislationApplies legislationApplies;
	public LegislationChangedBy legislationChangedBy;
	public LegislationChanges legislationChanges;
	public LegislationConsolidatedBy legislationConsolidatedBy;
	public LegislationConsolidates legislationConsolidates;
	public LegislationDate legislationDate;
	public LegislationDateVersion legislationDateVersion;
	public LegislationIdentifier legislationIdentifier;
	public LegislationLegalForce legislationLegalForce;
	public LegislationLegalValue legislationLegalValue;
	public LegislationPassedBy legislationPassedBy;
	public LegislationResponsible legislationResponsible;
	public LegislationTransposedBy legislationTransposedBy;
	public LegislationTransposes legislationTransposes;
	public LegislationType legislationType;
	public License license;
	public LocationCreated locationCreated;
	public MainEntity mainEntity;
	public MainEntityOfPage mainEntityOfPage;
	public Material material;
	public Mentions mentions;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Offers offers;
	public PlayerType playerType;
	public Position position;
	public PotentialAction potentialAction;
	public Producer producer;
	public ProductionCompany productionCompany;
	public Provider provider;
	public Publication publication;
	public Publisher publisher;
	public PublisherImprint publisherImprint;
	public PublishingPrinciples publishingPrinciples;
	public RecordedAt recordedAt;
	public RegionsAllowed regionsAllowed;
	public ReleasedEvent releasedEvent;
	public RequiresSubscription requiresSubscription;
	public Review review;
	public SameAs sameAs;
	public SchemaVersion schemaVersion;
	public SourceOrganization sourceOrganization;
	public SpatialCoverage spatialCoverage;
	public Sponsor sponsor;
	public TemporalCoverage temporalCoverage;
	public Text text;
	public ThumbnailUrl thumbnailUrl;
	public TimeRequired timeRequired;
	public TranslationOfWork translationOfWork;
	public Translator translator;
	public TypicalAgeRange typicalAgeRange;
	public UploadDate uploadDate;
	public Url url;
	public Version version;
	public Video video;
	public Width width;
	public WorkExample workExample;
	public WorkTranslation workTranslation;

	public LEGISLATION_OBJECT() {
	}

	public LEGISLATION_OBJECT(Long seq) {
		setSeq(seq);
	}

	public LEGISLATION_OBJECT(String string) {
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

	public LEGISLATION_OBJECT(About about) {
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

	public LEGISLATION_OBJECT(AccessMode accessMode) {
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

	public LEGISLATION_OBJECT(AccessModeSufficient accessModeSufficient) {
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

	public LEGISLATION_OBJECT(AccessibilityAPI accessibilityAPI) {
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

	public LEGISLATION_OBJECT(AccessibilityControl accessibilityControl) {
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

	public LEGISLATION_OBJECT(AccessibilityFeature accessibilityFeature) {
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

	public LEGISLATION_OBJECT(AccessibilityHazard accessibilityHazard) {
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

	public LEGISLATION_OBJECT(AccessibilitySummary accessibilitySummary) {
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

	public LEGISLATION_OBJECT(AccountablePerson accountablePerson) {
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

	public LEGISLATION_OBJECT(AdditionalType additionalType) {
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

	public LEGISLATION_OBJECT(AggregateRating aggregateRating) {
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

	public LEGISLATION_OBJECT(AlternateName alternateName) {
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

	public LEGISLATION_OBJECT(AlternativeHeadline alternativeHeadline) {
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

	public LEGISLATION_OBJECT(AssociatedArticle associatedArticle) {
		setAssociatedArticle(associatedArticle);
	}

	@Override
	public AssociatedArticle getAssociatedArticle() {
		return associatedArticle;
	}

	@Override
	public void setAssociatedArticle(AssociatedArticle associatedArticle) {
		this.associatedArticle = associatedArticle;
	}

	public LEGISLATION_OBJECT(AssociatedMedia associatedMedia) {
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

	public LEGISLATION_OBJECT(Audience audience) {
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

	public LEGISLATION_OBJECT(Audio audio) {
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

	public LEGISLATION_OBJECT(Author author) {
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

	public LEGISLATION_OBJECT(Award award) {
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

	public LEGISLATION_OBJECT(Bitrate bitrate) {
		setBitrate(bitrate);
	}

	@Override
	public Bitrate getBitrate() {
		return bitrate;
	}

	@Override
	public void setBitrate(Bitrate bitrate) {
		this.bitrate = bitrate;
	}

	public LEGISLATION_OBJECT(Character character) {
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

	public LEGISLATION_OBJECT(Citation citation) {
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

	public LEGISLATION_OBJECT(Comment comment) {
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

	public LEGISLATION_OBJECT(CommentCount commentCount) {
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

	public LEGISLATION_OBJECT(ContentLocation contentLocation) {
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

	public LEGISLATION_OBJECT(ContentRating contentRating) {
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

	public LEGISLATION_OBJECT(ContentReferenceTime contentReferenceTime) {
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

	public LEGISLATION_OBJECT(ContentSize contentSize) {
		setContentSize(contentSize);
	}

	@Override
	public ContentSize getContentSize() {
		return contentSize;
	}

	@Override
	public void setContentSize(ContentSize contentSize) {
		this.contentSize = contentSize;
	}

	public LEGISLATION_OBJECT(ContentUrl contentUrl) {
		setContentUrl(contentUrl);
	}

	@Override
	public ContentUrl getContentUrl() {
		return contentUrl;
	}

	@Override
	public void setContentUrl(ContentUrl contentUrl) {
		this.contentUrl = contentUrl;
	}

	public LEGISLATION_OBJECT(Contributor contributor) {
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

	public LEGISLATION_OBJECT(CopyrightHolder copyrightHolder) {
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

	public LEGISLATION_OBJECT(CopyrightYear copyrightYear) {
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

	public LEGISLATION_OBJECT(Creator creator) {
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

	public LEGISLATION_OBJECT(DateCreated dateCreated) {
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

	public LEGISLATION_OBJECT(DateModified dateModified) {
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

	public LEGISLATION_OBJECT(DatePublished datePublished) {
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

	public LEGISLATION_OBJECT(Description description) {
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

	public LEGISLATION_OBJECT(DisambiguatingDescription disambiguatingDescription) {
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

	public LEGISLATION_OBJECT(DiscussionUrl discussionUrl) {
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

	public LEGISLATION_OBJECT(Duration duration) {
		setDuration(duration);
	}

	@Override
	public Duration getDuration() {
		return duration;
	}

	@Override
	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public LEGISLATION_OBJECT(Editor editor) {
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

	public LEGISLATION_OBJECT(EducationalAlignment educationalAlignment) {
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

	public LEGISLATION_OBJECT(EducationalUse educationalUse) {
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

	public LEGISLATION_OBJECT(EmbedUrl embedUrl) {
		setEmbedUrl(embedUrl);
	}

	@Override
	public EmbedUrl getEmbedUrl() {
		return embedUrl;
	}

	@Override
	public void setEmbedUrl(EmbedUrl embedUrl) {
		this.embedUrl = embedUrl;
	}

	public LEGISLATION_OBJECT(EncodesCreativeWork encodesCreativeWork) {
		setEncodesCreativeWork(encodesCreativeWork);
	}

	@Override
	public EncodesCreativeWork getEncodesCreativeWork() {
		return encodesCreativeWork;
	}

	@Override
	public void setEncodesCreativeWork(EncodesCreativeWork encodesCreativeWork) {
		this.encodesCreativeWork = encodesCreativeWork;
	}

	public LEGISLATION_OBJECT(Encoding encoding) {
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

	public LEGISLATION_OBJECT(EncodingFormat encodingFormat) {
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

	public LEGISLATION_OBJECT(ExampleOfWork exampleOfWork) {
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

	public LEGISLATION_OBJECT(Expires expires) {
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

	public LEGISLATION_OBJECT(FileFormat fileFormat) {
		setFileFormat(fileFormat);
	}

	@Override
	public FileFormat getFileFormat() {
		return fileFormat;
	}

	@Override
	public void setFileFormat(FileFormat fileFormat) {
		this.fileFormat = fileFormat;
	}

	public LEGISLATION_OBJECT(Funder funder) {
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

	public LEGISLATION_OBJECT(Genre genre) {
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

	public LEGISLATION_OBJECT(HasPart hasPart) {
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

	public LEGISLATION_OBJECT(Headline headline) {
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

	public LEGISLATION_OBJECT(Height height) {
		setHeight(height);
	}

	@Override
	public Height getHeight() {
		return height;
	}

	@Override
	public void setHeight(Height height) {
		this.height = height;
	}

	public LEGISLATION_OBJECT(Identifier identifier) {
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

	public LEGISLATION_OBJECT(Image image) {
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

	public LEGISLATION_OBJECT(InLanguage inLanguage) {
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

	public LEGISLATION_OBJECT(InteractionStatistic interactionStatistic) {
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

	public LEGISLATION_OBJECT(InteractivityType interactivityType) {
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

	public LEGISLATION_OBJECT(IsAccessibleForFree isAccessibleForFree) {
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

	public LEGISLATION_OBJECT(IsBasedOn isBasedOn) {
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

	public LEGISLATION_OBJECT(IsFamilyFriendly isFamilyFriendly) {
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

	public LEGISLATION_OBJECT(IsPartOf isPartOf) {
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

	public LEGISLATION_OBJECT(Keywords keywords) {
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

	public LEGISLATION_OBJECT(LearningResourceType learningResourceType) {
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

	public LEGISLATION_OBJECT(LegislationAppliedBy legislationAppliedBy) {
		setLegislationAppliedBy(legislationAppliedBy);
	}

	@Override
	public LegislationAppliedBy getLegislationAppliedBy() {
		return legislationAppliedBy;
	}

	@Override
	public void setLegislationAppliedBy(LegislationAppliedBy legislationAppliedBy) {
		this.legislationAppliedBy = legislationAppliedBy;
	}

	public LEGISLATION_OBJECT(LegislationApplies legislationApplies) {
		setLegislationApplies(legislationApplies);
	}

	@Override
	public LegislationApplies getLegislationApplies() {
		return legislationApplies;
	}

	@Override
	public void setLegislationApplies(LegislationApplies legislationApplies) {
		this.legislationApplies = legislationApplies;
	}

	public LEGISLATION_OBJECT(LegislationChangedBy legislationChangedBy) {
		setLegislationChangedBy(legislationChangedBy);
	}

	@Override
	public LegislationChangedBy getLegislationChangedBy() {
		return legislationChangedBy;
	}

	@Override
	public void setLegislationChangedBy(LegislationChangedBy legislationChangedBy) {
		this.legislationChangedBy = legislationChangedBy;
	}

	public LEGISLATION_OBJECT(LegislationChanges legislationChanges) {
		setLegislationChanges(legislationChanges);
	}

	@Override
	public LegislationChanges getLegislationChanges() {
		return legislationChanges;
	}

	@Override
	public void setLegislationChanges(LegislationChanges legislationChanges) {
		this.legislationChanges = legislationChanges;
	}

	public LEGISLATION_OBJECT(LegislationConsolidatedBy legislationConsolidatedBy) {
		setLegislationConsolidatedBy(legislationConsolidatedBy);
	}

	@Override
	public LegislationConsolidatedBy getLegislationConsolidatedBy() {
		return legislationConsolidatedBy;
	}

	@Override
	public void setLegislationConsolidatedBy(LegislationConsolidatedBy legislationConsolidatedBy) {
		this.legislationConsolidatedBy = legislationConsolidatedBy;
	}

	public LEGISLATION_OBJECT(LegislationConsolidates legislationConsolidates) {
		setLegislationConsolidates(legislationConsolidates);
	}

	@Override
	public LegislationConsolidates getLegislationConsolidates() {
		return legislationConsolidates;
	}

	@Override
	public void setLegislationConsolidates(LegislationConsolidates legislationConsolidates) {
		this.legislationConsolidates = legislationConsolidates;
	}

	public LEGISLATION_OBJECT(LegislationDate legislationDate) {
		setLegislationDate(legislationDate);
	}

	@Override
	public LegislationDate getLegislationDate() {
		return legislationDate;
	}

	@Override
	public void setLegislationDate(LegislationDate legislationDate) {
		this.legislationDate = legislationDate;
	}

	public LEGISLATION_OBJECT(LegislationDateVersion legislationDateVersion) {
		setLegislationDateVersion(legislationDateVersion);
	}

	@Override
	public LegislationDateVersion getLegislationDateVersion() {
		return legislationDateVersion;
	}

	@Override
	public void setLegislationDateVersion(LegislationDateVersion legislationDateVersion) {
		this.legislationDateVersion = legislationDateVersion;
	}

	public LEGISLATION_OBJECT(LegislationIdentifier legislationIdentifier) {
		setLegislationIdentifier(legislationIdentifier);
	}

	@Override
	public LegislationIdentifier getLegislationIdentifier() {
		return legislationIdentifier;
	}

	@Override
	public void setLegislationIdentifier(LegislationIdentifier legislationIdentifier) {
		this.legislationIdentifier = legislationIdentifier;
	}

	public LEGISLATION_OBJECT(LegislationLegalForce legislationLegalForce) {
		setLegislationLegalForce(legislationLegalForce);
	}

	@Override
	public LegislationLegalForce getLegislationLegalForce() {
		return legislationLegalForce;
	}

	@Override
	public void setLegislationLegalForce(LegislationLegalForce legislationLegalForce) {
		this.legislationLegalForce = legislationLegalForce;
	}

	public LEGISLATION_OBJECT(LegislationLegalValue legislationLegalValue) {
		setLegislationLegalValue(legislationLegalValue);
	}

	@Override
	public LegislationLegalValue getLegislationLegalValue() {
		return legislationLegalValue;
	}

	@Override
	public void setLegislationLegalValue(LegislationLegalValue legislationLegalValue) {
		this.legislationLegalValue = legislationLegalValue;
	}

	public LEGISLATION_OBJECT(LegislationPassedBy legislationPassedBy) {
		setLegislationPassedBy(legislationPassedBy);
	}

	@Override
	public LegislationPassedBy getLegislationPassedBy() {
		return legislationPassedBy;
	}

	@Override
	public void setLegislationPassedBy(LegislationPassedBy legislationPassedBy) {
		this.legislationPassedBy = legislationPassedBy;
	}

	public LEGISLATION_OBJECT(LegislationResponsible legislationResponsible) {
		setLegislationResponsible(legislationResponsible);
	}

	@Override
	public LegislationResponsible getLegislationResponsible() {
		return legislationResponsible;
	}

	@Override
	public void setLegislationResponsible(LegislationResponsible legislationResponsible) {
		this.legislationResponsible = legislationResponsible;
	}

	public LEGISLATION_OBJECT(LegislationTransposedBy legislationTransposedBy) {
		setLegislationTransposedBy(legislationTransposedBy);
	}

	@Override
	public LegislationTransposedBy getLegislationTransposedBy() {
		return legislationTransposedBy;
	}

	@Override
	public void setLegislationTransposedBy(LegislationTransposedBy legislationTransposedBy) {
		this.legislationTransposedBy = legislationTransposedBy;
	}

	public LEGISLATION_OBJECT(LegislationTransposes legislationTransposes) {
		setLegislationTransposes(legislationTransposes);
	}

	@Override
	public LegislationTransposes getLegislationTransposes() {
		return legislationTransposes;
	}

	@Override
	public void setLegislationTransposes(LegislationTransposes legislationTransposes) {
		this.legislationTransposes = legislationTransposes;
	}

	public LEGISLATION_OBJECT(LegislationType legislationType) {
		setLegislationType(legislationType);
	}

	@Override
	public LegislationType getLegislationType() {
		return legislationType;
	}

	@Override
	public void setLegislationType(LegislationType legislationType) {
		this.legislationType = legislationType;
	}

	public LEGISLATION_OBJECT(License license) {
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

	public LEGISLATION_OBJECT(LocationCreated locationCreated) {
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

	public LEGISLATION_OBJECT(MainEntity mainEntity) {
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

	public LEGISLATION_OBJECT(MainEntityOfPage mainEntityOfPage) {
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

	public LEGISLATION_OBJECT(Material material) {
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

	public LEGISLATION_OBJECT(Mentions mentions) {
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

	public LEGISLATION_OBJECT(Name name) {
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

	public LEGISLATION_OBJECT(NameFuzzy nameFuzzy) {
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

	public LEGISLATION_OBJECT(NameRuby nameRuby) {
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

	public LEGISLATION_OBJECT(Offers offers) {
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

	public LEGISLATION_OBJECT(PlayerType playerType) {
		setPlayerType(playerType);
	}

	@Override
	public PlayerType getPlayerType() {
		return playerType;
	}

	@Override
	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}

	public LEGISLATION_OBJECT(Position position) {
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

	public LEGISLATION_OBJECT(PotentialAction potentialAction) {
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

	public LEGISLATION_OBJECT(Producer producer) {
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

	public LEGISLATION_OBJECT(ProductionCompany productionCompany) {
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

	public LEGISLATION_OBJECT(Provider provider) {
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

	public LEGISLATION_OBJECT(Publication publication) {
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

	public LEGISLATION_OBJECT(Publisher publisher) {
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

	public LEGISLATION_OBJECT(PublisherImprint publisherImprint) {
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

	public LEGISLATION_OBJECT(PublishingPrinciples publishingPrinciples) {
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

	public LEGISLATION_OBJECT(RecordedAt recordedAt) {
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

	public LEGISLATION_OBJECT(RegionsAllowed regionsAllowed) {
		setRegionsAllowed(regionsAllowed);
	}

	@Override
	public RegionsAllowed getRegionsAllowed() {
		return regionsAllowed;
	}

	@Override
	public void setRegionsAllowed(RegionsAllowed regionsAllowed) {
		this.regionsAllowed = regionsAllowed;
	}

	public LEGISLATION_OBJECT(ReleasedEvent releasedEvent) {
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

	public LEGISLATION_OBJECT(RequiresSubscription requiresSubscription) {
		setRequiresSubscription(requiresSubscription);
	}

	@Override
	public RequiresSubscription getRequiresSubscription() {
		return requiresSubscription;
	}

	@Override
	public void setRequiresSubscription(RequiresSubscription requiresSubscription) {
		this.requiresSubscription = requiresSubscription;
	}

	public LEGISLATION_OBJECT(Review review) {
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

	public LEGISLATION_OBJECT(SameAs sameAs) {
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

	public LEGISLATION_OBJECT(SchemaVersion schemaVersion) {
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

	public LEGISLATION_OBJECT(SourceOrganization sourceOrganization) {
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

	public LEGISLATION_OBJECT(SpatialCoverage spatialCoverage) {
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

	public LEGISLATION_OBJECT(Sponsor sponsor) {
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

	public LEGISLATION_OBJECT(TemporalCoverage temporalCoverage) {
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

	public LEGISLATION_OBJECT(Text text) {
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

	public LEGISLATION_OBJECT(ThumbnailUrl thumbnailUrl) {
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

	public LEGISLATION_OBJECT(TimeRequired timeRequired) {
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

	public LEGISLATION_OBJECT(TranslationOfWork translationOfWork) {
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

	public LEGISLATION_OBJECT(Translator translator) {
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

	public LEGISLATION_OBJECT(TypicalAgeRange typicalAgeRange) {
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

	public LEGISLATION_OBJECT(UploadDate uploadDate) {
		setUploadDate(uploadDate);
	}

	@Override
	public UploadDate getUploadDate() {
		return uploadDate;
	}

	@Override
	public void setUploadDate(UploadDate uploadDate) {
		this.uploadDate = uploadDate;
	}

	public LEGISLATION_OBJECT(Url url) {
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

	public LEGISLATION_OBJECT(Version version) {
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

	public LEGISLATION_OBJECT(Video video) {
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

	public LEGISLATION_OBJECT(Width width) {
		setWidth(width);
	}

	@Override
	public Width getWidth() {
		return width;
	}

	@Override
	public void setWidth(Width width) {
		this.width = width;
	}

	public LEGISLATION_OBJECT(WorkExample workExample) {
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

	public LEGISLATION_OBJECT(WorkTranslation workTranslation) {
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

	public LEGISLATION_OBJECT(Long seq,
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
			AdditionalType additionalType,
			AggregateRating aggregateRating,
			AlternateName alternateName,
			AlternativeHeadline alternativeHeadline,
			AssociatedArticle associatedArticle,
			AssociatedMedia associatedMedia,
			Audience audience,
			Audio audio,
			Author author,
			Award award,
			Bitrate bitrate,
			Character character,
			Citation citation,
			Comment comment,
			CommentCount commentCount,
			ContentLocation contentLocation,
			ContentRating contentRating,
			ContentReferenceTime contentReferenceTime,
			ContentSize contentSize,
			ContentUrl contentUrl,
			Contributor contributor,
			CopyrightHolder copyrightHolder,
			CopyrightYear copyrightYear,
			Creator creator,
			DateCreated dateCreated,
			DateModified dateModified,
			DatePublished datePublished,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			DiscussionUrl discussionUrl,
			Duration duration,
			Editor editor,
			EducationalAlignment educationalAlignment,
			EducationalUse educationalUse,
			EmbedUrl embedUrl,
			EncodesCreativeWork encodesCreativeWork,
			Encoding encoding,
			EncodingFormat encodingFormat,
			ExampleOfWork exampleOfWork,
			Expires expires,
			FileFormat fileFormat,
			Funder funder,
			Genre genre,
			HasPart hasPart,
			Headline headline,
			Height height,
			Identifier identifier,
			Image image,
			InLanguage inLanguage,
			InteractionStatistic interactionStatistic,
			InteractivityType interactivityType,
			IsAccessibleForFree isAccessibleForFree,
			IsBasedOn isBasedOn,
			IsFamilyFriendly isFamilyFriendly,
			IsPartOf isPartOf,
			Keywords keywords,
			LearningResourceType learningResourceType,
			LegislationAppliedBy legislationAppliedBy,
			LegislationApplies legislationApplies,
			LegislationChangedBy legislationChangedBy,
			LegislationChanges legislationChanges,
			LegislationConsolidatedBy legislationConsolidatedBy,
			LegislationConsolidates legislationConsolidates,
			LegislationDate legislationDate,
			LegislationDateVersion legislationDateVersion,
			LegislationIdentifier legislationIdentifier,
			LegislationLegalForce legislationLegalForce,
			LegislationLegalValue legislationLegalValue,
			LegislationPassedBy legislationPassedBy,
			LegislationResponsible legislationResponsible,
			LegislationTransposedBy legislationTransposedBy,
			LegislationTransposes legislationTransposes,
			LegislationType legislationType,
			License license,
			LocationCreated locationCreated,
			MainEntity mainEntity,
			MainEntityOfPage mainEntityOfPage,
			Material material,
			Mentions mentions,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			Offers offers,
			PlayerType playerType,
			Position position,
			PotentialAction potentialAction,
			Producer producer,
			ProductionCompany productionCompany,
			Provider provider,
			Publication publication,
			Publisher publisher,
			PublisherImprint publisherImprint,
			PublishingPrinciples publishingPrinciples,
			RecordedAt recordedAt,
			RegionsAllowed regionsAllowed,
			ReleasedEvent releasedEvent,
			RequiresSubscription requiresSubscription,
			Review review,
			SameAs sameAs,
			SchemaVersion schemaVersion,
			SourceOrganization sourceOrganization,
			SpatialCoverage spatialCoverage,
			Sponsor sponsor,
			TemporalCoverage temporalCoverage,
			Text text,
			ThumbnailUrl thumbnailUrl,
			TimeRequired timeRequired,
			TranslationOfWork translationOfWork,
			Translator translator,
			TypicalAgeRange typicalAgeRange,
			UploadDate uploadDate,
			Url url,
			Version version,
			Video video,
			Width width,
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
		setAdditionalType(additionalType);
		setAggregateRating(aggregateRating);
		setAlternateName(alternateName);
		setAlternativeHeadline(alternativeHeadline);
		setAssociatedArticle(associatedArticle);
		setAssociatedMedia(associatedMedia);
		setAudience(audience);
		setAudio(audio);
		setAuthor(author);
		setAward(award);
		setBitrate(bitrate);
		setCharacter(character);
		setCitation(citation);
		setComment(comment);
		setCommentCount(commentCount);
		setContentLocation(contentLocation);
		setContentRating(contentRating);
		setContentReferenceTime(contentReferenceTime);
		setContentSize(contentSize);
		setContentUrl(contentUrl);
		setContributor(contributor);
		setCopyrightHolder(copyrightHolder);
		setCopyrightYear(copyrightYear);
		setCreator(creator);
		setDateCreated(dateCreated);
		setDateModified(dateModified);
		setDatePublished(datePublished);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setDiscussionUrl(discussionUrl);
		setDuration(duration);
		setEditor(editor);
		setEducationalAlignment(educationalAlignment);
		setEducationalUse(educationalUse);
		setEmbedUrl(embedUrl);
		setEncodesCreativeWork(encodesCreativeWork);
		setEncoding(encoding);
		setEncodingFormat(encodingFormat);
		setExampleOfWork(exampleOfWork);
		setExpires(expires);
		setFileFormat(fileFormat);
		setFunder(funder);
		setGenre(genre);
		setHasPart(hasPart);
		setHeadline(headline);
		setHeight(height);
		setIdentifier(identifier);
		setImage(image);
		setInLanguage(inLanguage);
		setInteractionStatistic(interactionStatistic);
		setInteractivityType(interactivityType);
		setIsAccessibleForFree(isAccessibleForFree);
		setIsBasedOn(isBasedOn);
		setIsFamilyFriendly(isFamilyFriendly);
		setIsPartOf(isPartOf);
		setKeywords(keywords);
		setLearningResourceType(learningResourceType);
		setLegislationAppliedBy(legislationAppliedBy);
		setLegislationApplies(legislationApplies);
		setLegislationChangedBy(legislationChangedBy);
		setLegislationChanges(legislationChanges);
		setLegislationConsolidatedBy(legislationConsolidatedBy);
		setLegislationConsolidates(legislationConsolidates);
		setLegislationDate(legislationDate);
		setLegislationDateVersion(legislationDateVersion);
		setLegislationIdentifier(legislationIdentifier);
		setLegislationLegalForce(legislationLegalForce);
		setLegislationLegalValue(legislationLegalValue);
		setLegislationPassedBy(legislationPassedBy);
		setLegislationResponsible(legislationResponsible);
		setLegislationTransposedBy(legislationTransposedBy);
		setLegislationTransposes(legislationTransposes);
		setLegislationType(legislationType);
		setLicense(license);
		setLocationCreated(locationCreated);
		setMainEntity(mainEntity);
		setMainEntityOfPage(mainEntityOfPage);
		setMaterial(material);
		setMentions(mentions);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setOffers(offers);
		setPlayerType(playerType);
		setPosition(position);
		setPotentialAction(potentialAction);
		setProducer(producer);
		setProductionCompany(productionCompany);
		setProvider(provider);
		setPublication(publication);
		setPublisher(publisher);
		setPublisherImprint(publisherImprint);
		setPublishingPrinciples(publishingPrinciples);
		setRecordedAt(recordedAt);
		setRegionsAllowed(regionsAllowed);
		setReleasedEvent(releasedEvent);
		setRequiresSubscription(requiresSubscription);
		setReview(review);
		setSameAs(sameAs);
		setSchemaVersion(schemaVersion);
		setSourceOrganization(sourceOrganization);
		setSpatialCoverage(spatialCoverage);
		setSponsor(sponsor);
		setTemporalCoverage(temporalCoverage);
		setText(text);
		setThumbnailUrl(thumbnailUrl);
		setTimeRequired(timeRequired);
		setTranslationOfWork(translationOfWork);
		setTranslator(translator);
		setTypicalAgeRange(typicalAgeRange);
		setUploadDate(uploadDate);
		setUrl(url);
		setVersion(version);
		setVideo(video);
		setWidth(width);
		setWorkExample(workExample);
		setWorkTranslation(workTranslation);
	}

	public void copy(Clazz.LegislationObject org) {
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
		setAdditionalType(org.getAdditionalType());
		setAggregateRating(org.getAggregateRating());
		setAlternateName(org.getAlternateName());
		setAlternativeHeadline(org.getAlternativeHeadline());
		setAssociatedArticle(org.getAssociatedArticle());
		setAssociatedMedia(org.getAssociatedMedia());
		setAudience(org.getAudience());
		setAudio(org.getAudio());
		setAuthor(org.getAuthor());
		setAward(org.getAward());
		setBitrate(org.getBitrate());
		setCharacter(org.getCharacter());
		setCitation(org.getCitation());
		setComment(org.getComment());
		setCommentCount(org.getCommentCount());
		setContentLocation(org.getContentLocation());
		setContentRating(org.getContentRating());
		setContentReferenceTime(org.getContentReferenceTime());
		setContentSize(org.getContentSize());
		setContentUrl(org.getContentUrl());
		setContributor(org.getContributor());
		setCopyrightHolder(org.getCopyrightHolder());
		setCopyrightYear(org.getCopyrightYear());
		setCreator(org.getCreator());
		setDateCreated(org.getDateCreated());
		setDateModified(org.getDateModified());
		setDatePublished(org.getDatePublished());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDiscussionUrl(org.getDiscussionUrl());
		setDuration(org.getDuration());
		setEditor(org.getEditor());
		setEducationalAlignment(org.getEducationalAlignment());
		setEducationalUse(org.getEducationalUse());
		setEmbedUrl(org.getEmbedUrl());
		setEncodesCreativeWork(org.getEncodesCreativeWork());
		setEncoding(org.getEncoding());
		setEncodingFormat(org.getEncodingFormat());
		setExampleOfWork(org.getExampleOfWork());
		setExpires(org.getExpires());
		setFileFormat(org.getFileFormat());
		setFunder(org.getFunder());
		setGenre(org.getGenre());
		setHasPart(org.getHasPart());
		setHeadline(org.getHeadline());
		setHeight(org.getHeight());
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
		setLegislationAppliedBy(org.getLegislationAppliedBy());
		setLegislationApplies(org.getLegislationApplies());
		setLegislationChangedBy(org.getLegislationChangedBy());
		setLegislationChanges(org.getLegislationChanges());
		setLegislationConsolidatedBy(org.getLegislationConsolidatedBy());
		setLegislationConsolidates(org.getLegislationConsolidates());
		setLegislationDate(org.getLegislationDate());
		setLegislationDateVersion(org.getLegislationDateVersion());
		setLegislationIdentifier(org.getLegislationIdentifier());
		setLegislationLegalForce(org.getLegislationLegalForce());
		setLegislationLegalValue(org.getLegislationLegalValue());
		setLegislationPassedBy(org.getLegislationPassedBy());
		setLegislationResponsible(org.getLegislationResponsible());
		setLegislationTransposedBy(org.getLegislationTransposedBy());
		setLegislationTransposes(org.getLegislationTransposes());
		setLegislationType(org.getLegislationType());
		setLicense(org.getLicense());
		setLocationCreated(org.getLocationCreated());
		setMainEntity(org.getMainEntity());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMaterial(org.getMaterial());
		setMentions(org.getMentions());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOffers(org.getOffers());
		setPlayerType(org.getPlayerType());
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
		setRegionsAllowed(org.getRegionsAllowed());
		setReleasedEvent(org.getReleasedEvent());
		setRequiresSubscription(org.getRequiresSubscription());
		setReview(org.getReview());
		setSameAs(org.getSameAs());
		setSchemaVersion(org.getSchemaVersion());
		setSourceOrganization(org.getSourceOrganization());
		setSpatialCoverage(org.getSpatialCoverage());
		setSponsor(org.getSponsor());
		setTemporalCoverage(org.getTemporalCoverage());
		setText(org.getText());
		setThumbnailUrl(org.getThumbnailUrl());
		setTimeRequired(org.getTimeRequired());
		setTranslationOfWork(org.getTranslationOfWork());
		setTranslator(org.getTranslator());
		setTypicalAgeRange(org.getTypicalAgeRange());
		setUploadDate(org.getUploadDate());
		setUrl(org.getUrl());
		setVersion(org.getVersion());
		setVideo(org.getVideo());
		setWidth(org.getWidth());
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
