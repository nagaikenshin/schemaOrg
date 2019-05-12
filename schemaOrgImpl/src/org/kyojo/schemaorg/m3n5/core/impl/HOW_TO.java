package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.bib.Container.PublisherImprint;
import org.kyojo.schemaorg.m3n5.bib.Container.TranslationOfWork;
import org.kyojo.schemaorg.m3n5.bib.Container.WorkTranslation;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Container.About;
import org.kyojo.schemaorg.m3n5.core.Container.AccessMode;
import org.kyojo.schemaorg.m3n5.core.Container.AccessModeSufficient;
import org.kyojo.schemaorg.m3n5.core.Container.AccessibilityAPI;
import org.kyojo.schemaorg.m3n5.core.Container.AccessibilityControl;
import org.kyojo.schemaorg.m3n5.core.Container.AccessibilityFeature;
import org.kyojo.schemaorg.m3n5.core.Container.AccessibilityHazard;
import org.kyojo.schemaorg.m3n5.core.Container.AccessibilitySummary;
import org.kyojo.schemaorg.m3n5.core.Container.AccountablePerson;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.core.Container.AggregateRating;
import org.kyojo.schemaorg.m3n5.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n5.core.Container.AlternativeHeadline;
import org.kyojo.schemaorg.m3n5.core.Container.AssociatedMedia;
import org.kyojo.schemaorg.m3n5.core.Container.Audience;
import org.kyojo.schemaorg.m3n5.core.Container.Audio;
import org.kyojo.schemaorg.m3n5.core.Container.Author;
import org.kyojo.schemaorg.m3n5.core.Container.Award;
import org.kyojo.schemaorg.m3n5.core.Container.Character;
import org.kyojo.schemaorg.m3n5.core.Container.Citation;
import org.kyojo.schemaorg.m3n5.core.Container.Comment;
import org.kyojo.schemaorg.m3n5.core.Container.CommentCount;
import org.kyojo.schemaorg.m3n5.core.Container.ContentLocation;
import org.kyojo.schemaorg.m3n5.core.Container.ContentRating;
import org.kyojo.schemaorg.m3n5.core.Container.Contributor;
import org.kyojo.schemaorg.m3n5.core.Container.CopyrightHolder;
import org.kyojo.schemaorg.m3n5.core.Container.CopyrightYear;
import org.kyojo.schemaorg.m3n5.core.Container.Creator;
import org.kyojo.schemaorg.m3n5.core.Container.DateCreated;
import org.kyojo.schemaorg.m3n5.core.Container.DateModified;
import org.kyojo.schemaorg.m3n5.core.Container.DatePublished;
import org.kyojo.schemaorg.m3n5.core.Container.Description;
import org.kyojo.schemaorg.m3n5.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n5.core.Container.DiscussionUrl;
import org.kyojo.schemaorg.m3n5.core.Container.Editor;
import org.kyojo.schemaorg.m3n5.core.Container.EducationalAlignment;
import org.kyojo.schemaorg.m3n5.core.Container.EducationalUse;
import org.kyojo.schemaorg.m3n5.core.Container.Encoding;
import org.kyojo.schemaorg.m3n5.core.Container.EncodingFormat;
import org.kyojo.schemaorg.m3n5.core.Container.EstimatedCost;
import org.kyojo.schemaorg.m3n5.core.Container.ExampleOfWork;
import org.kyojo.schemaorg.m3n5.core.Container.Expires;
import org.kyojo.schemaorg.m3n5.core.Container.Funder;
import org.kyojo.schemaorg.m3n5.core.Container.Genre;
import org.kyojo.schemaorg.m3n5.core.Container.HasPart;
import org.kyojo.schemaorg.m3n5.core.Container.Headline;
import org.kyojo.schemaorg.m3n5.core.Container.Identifier;
import org.kyojo.schemaorg.m3n5.core.Container.Image;
import org.kyojo.schemaorg.m3n5.core.Container.InLanguage;
import org.kyojo.schemaorg.m3n5.core.Container.InteractionStatistic;
import org.kyojo.schemaorg.m3n5.core.Container.InteractivityType;
import org.kyojo.schemaorg.m3n5.core.Container.IsAccessibleForFree;
import org.kyojo.schemaorg.m3n5.core.Container.IsBasedOn;
import org.kyojo.schemaorg.m3n5.core.Container.IsFamilyFriendly;
import org.kyojo.schemaorg.m3n5.core.Container.IsPartOf;
import org.kyojo.schemaorg.m3n5.core.Container.Keywords;
import org.kyojo.schemaorg.m3n5.core.Container.LearningResourceType;
import org.kyojo.schemaorg.m3n5.core.Container.License;
import org.kyojo.schemaorg.m3n5.core.Container.LocationCreated;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntity;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.core.Container.Material;
import org.kyojo.schemaorg.m3n5.core.Container.Mentions;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n5.core.Container.Offers;
import org.kyojo.schemaorg.m3n5.core.Container.PerformTime;
import org.kyojo.schemaorg.m3n5.core.Container.Position;
import org.kyojo.schemaorg.m3n5.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n5.core.Container.PrepTime;
import org.kyojo.schemaorg.m3n5.core.Container.Producer;
import org.kyojo.schemaorg.m3n5.core.Container.Provider;
import org.kyojo.schemaorg.m3n5.core.Container.Publication;
import org.kyojo.schemaorg.m3n5.core.Container.Publisher;
import org.kyojo.schemaorg.m3n5.core.Container.PublishingPrinciples;
import org.kyojo.schemaorg.m3n5.core.Container.RecordedAt;
import org.kyojo.schemaorg.m3n5.core.Container.ReleasedEvent;
import org.kyojo.schemaorg.m3n5.core.Container.Review;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;
import org.kyojo.schemaorg.m3n5.core.Container.SchemaVersion;
import org.kyojo.schemaorg.m3n5.core.Container.SourceOrganization;
import org.kyojo.schemaorg.m3n5.core.Container.Spatial;
import org.kyojo.schemaorg.m3n5.core.Container.SpatialCoverage;
import org.kyojo.schemaorg.m3n5.core.Container.Sponsor;
import org.kyojo.schemaorg.m3n5.core.Container.Step;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;
import org.kyojo.schemaorg.m3n5.core.Container.Supply;
import org.kyojo.schemaorg.m3n5.core.Container.Temporal;
import org.kyojo.schemaorg.m3n5.core.Container.TemporalCoverage;
import org.kyojo.schemaorg.m3n5.core.Container.Text;
import org.kyojo.schemaorg.m3n5.core.Container.ThumbnailUrl;
import org.kyojo.schemaorg.m3n5.core.Container.TimeRequired;
import org.kyojo.schemaorg.m3n5.core.Container.Tool;
import org.kyojo.schemaorg.m3n5.core.Container.TotalTime;
import org.kyojo.schemaorg.m3n5.core.Container.Translator;
import org.kyojo.schemaorg.m3n5.core.Container.TypicalAgeRange;
import org.kyojo.schemaorg.m3n5.core.Container.Url;
import org.kyojo.schemaorg.m3n5.core.Container.Version;
import org.kyojo.schemaorg.m3n5.core.Container.Video;
import org.kyojo.schemaorg.m3n5.core.Container.WorkExample;
import org.kyojo.schemaorg.m3n5.core.Container.Yield;
import org.kyojo.schemaorg.m3n5.core.DataType;
import org.kyojo.schemaorg.m3n5.core.impl.NAME;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.pending.Container.ContentReferenceTime;
import org.kyojo.schemaorg.m3n5.pending.Container.Correction;
import org.kyojo.schemaorg.m3n5.pending.Container.MaterialExtent;
import org.kyojo.schemaorg.m3n5.pending.Container.SdDatePublished;
import org.kyojo.schemaorg.m3n5.pending.Container.SdLicense;
import org.kyojo.schemaorg.m3n5.pending.Container.SdPublisher;

public class HOW_TO implements Clazz.HowTo {

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
	public AssociatedMedia associatedMedia;
	public Audience audience;
	public Audio audio;
	public Author author;
	public Award award;
	public Character character;
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
	public Creator creator;
	public DateCreated dateCreated;
	public DateModified dateModified;
	public DatePublished datePublished;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public DiscussionUrl discussionUrl;
	public Editor editor;
	public EducationalAlignment educationalAlignment;
	public EducationalUse educationalUse;
	public Encoding encoding;
	public EncodingFormat encodingFormat;
	public EstimatedCost estimatedCost;
	public ExampleOfWork exampleOfWork;
	public Expires expires;
	public Funder funder;
	public Genre genre;
	public HasPart hasPart;
	public Headline headline;
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
	public License license;
	public LocationCreated locationCreated;
	public MainEntity mainEntity;
	public MainEntityOfPage mainEntityOfPage;
	public Material material;
	public MaterialExtent materialExtent;
	public Mentions mentions;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Offers offers;
	public PerformTime performTime;
	public Position position;
	public PotentialAction potentialAction;
	public PrepTime prepTime;
	public Producer producer;
	public Provider provider;
	public Publication publication;
	public Publisher publisher;
	public PublisherImprint publisherImprint;
	public PublishingPrinciples publishingPrinciples;
	public RecordedAt recordedAt;
	public ReleasedEvent releasedEvent;
	public Review review;
	public SameAs sameAs;
	public SchemaVersion schemaVersion;
	public SdDatePublished sdDatePublished;
	public SdLicense sdLicense;
	public SdPublisher sdPublisher;
	public SourceOrganization sourceOrganization;
	public Spatial spatial;
	public SpatialCoverage spatialCoverage;
	public Sponsor sponsor;
	public Step step;
	public SubjectOf subjectOf;
	public Supply supply;
	public Temporal temporal;
	public TemporalCoverage temporalCoverage;
	public Text text;
	public ThumbnailUrl thumbnailUrl;
	public TimeRequired timeRequired;
	public Tool tool;
	public TotalTime totalTime;
	public TranslationOfWork translationOfWork;
	public Translator translator;
	public TypicalAgeRange typicalAgeRange;
	public Url url;
	public Version version;
	public Video video;
	public WorkExample workExample;
	public WorkTranslation workTranslation;
	public Yield yield;

	public HOW_TO() {
	}

	public HOW_TO(Long seq) {
		setSeq(seq);
	}

	public HOW_TO(String string) {
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

	public HOW_TO(About about) {
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

	public HOW_TO(AccessMode accessMode) {
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

	public HOW_TO(AccessModeSufficient accessModeSufficient) {
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

	public HOW_TO(AccessibilityAPI accessibilityAPI) {
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

	public HOW_TO(AccessibilityControl accessibilityControl) {
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

	public HOW_TO(AccessibilityFeature accessibilityFeature) {
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

	public HOW_TO(AccessibilityHazard accessibilityHazard) {
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

	public HOW_TO(AccessibilitySummary accessibilitySummary) {
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

	public HOW_TO(AccountablePerson accountablePerson) {
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

	public HOW_TO(AdditionalType additionalType) {
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

	public HOW_TO(AggregateRating aggregateRating) {
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

	public HOW_TO(AlternateName alternateName) {
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

	public HOW_TO(AlternativeHeadline alternativeHeadline) {
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

	public HOW_TO(AssociatedMedia associatedMedia) {
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

	public HOW_TO(Audience audience) {
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

	public HOW_TO(Audio audio) {
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

	public HOW_TO(Author author) {
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

	public HOW_TO(Award award) {
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

	public HOW_TO(Character character) {
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

	public HOW_TO(Citation citation) {
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

	public HOW_TO(Comment comment) {
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

	public HOW_TO(CommentCount commentCount) {
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

	public HOW_TO(ContentLocation contentLocation) {
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

	public HOW_TO(ContentRating contentRating) {
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

	public HOW_TO(ContentReferenceTime contentReferenceTime) {
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

	public HOW_TO(Contributor contributor) {
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

	public HOW_TO(CopyrightHolder copyrightHolder) {
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

	public HOW_TO(CopyrightYear copyrightYear) {
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

	public HOW_TO(Correction correction) {
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

	public HOW_TO(Creator creator) {
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

	public HOW_TO(DateCreated dateCreated) {
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

	public HOW_TO(DateModified dateModified) {
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

	public HOW_TO(DatePublished datePublished) {
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

	public HOW_TO(Description description) {
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

	public HOW_TO(DisambiguatingDescription disambiguatingDescription) {
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

	public HOW_TO(DiscussionUrl discussionUrl) {
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

	public HOW_TO(Editor editor) {
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

	public HOW_TO(EducationalAlignment educationalAlignment) {
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

	public HOW_TO(EducationalUse educationalUse) {
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

	public HOW_TO(Encoding encoding) {
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

	public HOW_TO(EncodingFormat encodingFormat) {
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

	public HOW_TO(EstimatedCost estimatedCost) {
		setEstimatedCost(estimatedCost);
	}

	@Override
	public EstimatedCost getEstimatedCost() {
		return estimatedCost;
	}

	@Override
	public void setEstimatedCost(EstimatedCost estimatedCost) {
		this.estimatedCost = estimatedCost;
	}

	public HOW_TO(ExampleOfWork exampleOfWork) {
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

	public HOW_TO(Expires expires) {
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

	public HOW_TO(Funder funder) {
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

	public HOW_TO(Genre genre) {
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

	public HOW_TO(HasPart hasPart) {
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

	public HOW_TO(Headline headline) {
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

	public HOW_TO(Identifier identifier) {
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

	public HOW_TO(Image image) {
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

	public HOW_TO(InLanguage inLanguage) {
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

	public HOW_TO(InteractionStatistic interactionStatistic) {
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

	public HOW_TO(InteractivityType interactivityType) {
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

	public HOW_TO(IsAccessibleForFree isAccessibleForFree) {
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

	public HOW_TO(IsBasedOn isBasedOn) {
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

	public HOW_TO(IsFamilyFriendly isFamilyFriendly) {
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

	public HOW_TO(IsPartOf isPartOf) {
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

	public HOW_TO(Keywords keywords) {
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

	public HOW_TO(LearningResourceType learningResourceType) {
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

	public HOW_TO(License license) {
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

	public HOW_TO(LocationCreated locationCreated) {
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

	public HOW_TO(MainEntity mainEntity) {
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

	public HOW_TO(MainEntityOfPage mainEntityOfPage) {
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

	public HOW_TO(Material material) {
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

	public HOW_TO(MaterialExtent materialExtent) {
		setMaterialExtent(materialExtent);
	}

	@Override
	public MaterialExtent getMaterialExtent() {
		return materialExtent;
	}

	@Override
	public void setMaterialExtent(MaterialExtent materialExtent) {
		this.materialExtent = materialExtent;
	}

	public HOW_TO(Mentions mentions) {
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

	public HOW_TO(Name name) {
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

	public HOW_TO(NameFuzzy nameFuzzy) {
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

	public HOW_TO(NameRuby nameRuby) {
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

	public HOW_TO(Offers offers) {
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

	public HOW_TO(PerformTime performTime) {
		setPerformTime(performTime);
	}

	@Override
	public PerformTime getPerformTime() {
		return performTime;
	}

	@Override
	public void setPerformTime(PerformTime performTime) {
		this.performTime = performTime;
	}

	public HOW_TO(Position position) {
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

	public HOW_TO(PotentialAction potentialAction) {
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

	public HOW_TO(PrepTime prepTime) {
		setPrepTime(prepTime);
	}

	@Override
	public PrepTime getPrepTime() {
		return prepTime;
	}

	@Override
	public void setPrepTime(PrepTime prepTime) {
		this.prepTime = prepTime;
	}

	public HOW_TO(Producer producer) {
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

	public HOW_TO(Provider provider) {
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

	public HOW_TO(Publication publication) {
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

	public HOW_TO(Publisher publisher) {
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

	public HOW_TO(PublisherImprint publisherImprint) {
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

	public HOW_TO(PublishingPrinciples publishingPrinciples) {
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

	public HOW_TO(RecordedAt recordedAt) {
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

	public HOW_TO(ReleasedEvent releasedEvent) {
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

	public HOW_TO(Review review) {
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

	public HOW_TO(SameAs sameAs) {
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

	public HOW_TO(SchemaVersion schemaVersion) {
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

	public HOW_TO(SdDatePublished sdDatePublished) {
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

	public HOW_TO(SdLicense sdLicense) {
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

	public HOW_TO(SdPublisher sdPublisher) {
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

	public HOW_TO(SourceOrganization sourceOrganization) {
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

	public HOW_TO(Spatial spatial) {
		setSpatial(spatial);
	}

	@Override
	public Spatial getSpatial() {
		return spatial;
	}

	@Override
	public void setSpatial(Spatial spatial) {
		this.spatial = spatial;
	}

	public HOW_TO(SpatialCoverage spatialCoverage) {
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

	public HOW_TO(Sponsor sponsor) {
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

	public HOW_TO(Step step) {
		setStep(step);
	}

	@Override
	public Step getStep() {
		return step;
	}

	@Override
	public void setStep(Step step) {
		this.step = step;
	}

	public HOW_TO(SubjectOf subjectOf) {
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

	public HOW_TO(Supply supply) {
		setSupply(supply);
	}

	@Override
	public Supply getSupply() {
		return supply;
	}

	@Override
	public void setSupply(Supply supply) {
		this.supply = supply;
	}

	public HOW_TO(Temporal temporal) {
		setTemporal(temporal);
	}

	@Override
	public Temporal getTemporal() {
		return temporal;
	}

	@Override
	public void setTemporal(Temporal temporal) {
		this.temporal = temporal;
	}

	public HOW_TO(TemporalCoverage temporalCoverage) {
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

	public HOW_TO(Text text) {
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

	public HOW_TO(ThumbnailUrl thumbnailUrl) {
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

	public HOW_TO(TimeRequired timeRequired) {
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

	public HOW_TO(Tool tool) {
		setTool(tool);
	}

	@Override
	public Tool getTool() {
		return tool;
	}

	@Override
	public void setTool(Tool tool) {
		this.tool = tool;
	}

	public HOW_TO(TotalTime totalTime) {
		setTotalTime(totalTime);
	}

	@Override
	public TotalTime getTotalTime() {
		return totalTime;
	}

	@Override
	public void setTotalTime(TotalTime totalTime) {
		this.totalTime = totalTime;
	}

	public HOW_TO(TranslationOfWork translationOfWork) {
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

	public HOW_TO(Translator translator) {
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

	public HOW_TO(TypicalAgeRange typicalAgeRange) {
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

	public HOW_TO(Url url) {
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

	public HOW_TO(Version version) {
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

	public HOW_TO(Video video) {
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

	public HOW_TO(WorkExample workExample) {
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

	public HOW_TO(WorkTranslation workTranslation) {
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

	public HOW_TO(Yield yield) {
		setYield(yield);
	}

	@Override
	public Yield getYield() {
		return yield;
	}

	@Override
	public void setYield(Yield yield) {
		this.yield = yield;
	}

	public void copy(Clazz.HowTo org) {
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
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDiscussionUrl(org.getDiscussionUrl());
		setEditor(org.getEditor());
		setEducationalAlignment(org.getEducationalAlignment());
		setEducationalUse(org.getEducationalUse());
		setEncoding(org.getEncoding());
		setEncodingFormat(org.getEncodingFormat());
		setEstimatedCost(org.getEstimatedCost());
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
		setMaterialExtent(org.getMaterialExtent());
		setMentions(org.getMentions());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOffers(org.getOffers());
		setPerformTime(org.getPerformTime());
		setPosition(org.getPosition());
		setPotentialAction(org.getPotentialAction());
		setPrepTime(org.getPrepTime());
		setProducer(org.getProducer());
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
		setSpatial(org.getSpatial());
		setSpatialCoverage(org.getSpatialCoverage());
		setSponsor(org.getSponsor());
		setStep(org.getStep());
		setSubjectOf(org.getSubjectOf());
		setSupply(org.getSupply());
		setTemporal(org.getTemporal());
		setTemporalCoverage(org.getTemporalCoverage());
		setText(org.getText());
		setThumbnailUrl(org.getThumbnailUrl());
		setTimeRequired(org.getTimeRequired());
		setTool(org.getTool());
		setTotalTime(org.getTotalTime());
		setTranslationOfWork(org.getTranslationOfWork());
		setTranslator(org.getTranslator());
		setTypicalAgeRange(org.getTypicalAgeRange());
		setUrl(org.getUrl());
		setVersion(org.getVersion());
		setVideo(org.getVideo());
		setWorkExample(org.getWorkExample());
		setWorkTranslation(org.getWorkTranslation());
		setYield(org.getYield());
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
