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
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AggregateRating;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.AlternativeHeadline;
import org.kyojo.schemaorg.m3n4.core.Container.AssociatedMedia;
import org.kyojo.schemaorg.m3n4.core.Container.Audience;
import org.kyojo.schemaorg.m3n4.core.Container.Audio;
import org.kyojo.schemaorg.m3n4.core.Container.Author;
import org.kyojo.schemaorg.m3n4.core.Container.Award;
import org.kyojo.schemaorg.m3n4.core.Container.ByArtist;
import org.kyojo.schemaorg.m3n4.core.Container.Character;
import org.kyojo.schemaorg.m3n4.core.Container.Citation;
import org.kyojo.schemaorg.m3n4.core.Container.Comment;
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
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.DiscussionUrl;
import org.kyojo.schemaorg.m3n4.core.Container.Editor;
import org.kyojo.schemaorg.m3n4.core.Container.EducationalAlignment;
import org.kyojo.schemaorg.m3n4.core.Container.EducationalUse;
import org.kyojo.schemaorg.m3n4.core.Container.Encoding;
import org.kyojo.schemaorg.m3n4.core.Container.EncodingFormat;
import org.kyojo.schemaorg.m3n4.core.Container.ExampleOfWork;
import org.kyojo.schemaorg.m3n4.core.Container.Expires;
import org.kyojo.schemaorg.m3n4.core.Container.Funder;
import org.kyojo.schemaorg.m3n4.core.Container.Genre;
import org.kyojo.schemaorg.m3n4.core.Container.HasPart;
import org.kyojo.schemaorg.m3n4.core.Container.Headline;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.InAlbum;
import org.kyojo.schemaorg.m3n4.core.Container.InLanguage;
import org.kyojo.schemaorg.m3n4.core.Container.InPlaylist;
import org.kyojo.schemaorg.m3n4.core.Container.InteractionStatistic;
import org.kyojo.schemaorg.m3n4.core.Container.InteractivityType;
import org.kyojo.schemaorg.m3n4.core.Container.IsAccessibleForFree;
import org.kyojo.schemaorg.m3n4.core.Container.IsBasedOn;
import org.kyojo.schemaorg.m3n4.core.Container.IsFamilyFriendly;
import org.kyojo.schemaorg.m3n4.core.Container.IsPartOf;
import org.kyojo.schemaorg.m3n4.core.Container.IsrcCode;
import org.kyojo.schemaorg.m3n4.core.Container.Keywords;
import org.kyojo.schemaorg.m3n4.core.Container.LearningResourceType;
import org.kyojo.schemaorg.m3n4.core.Container.License;
import org.kyojo.schemaorg.m3n4.core.Container.LocationCreated;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntity;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.Material;
import org.kyojo.schemaorg.m3n4.core.Container.Mentions;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.Offers;
import org.kyojo.schemaorg.m3n4.core.Container.Position;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.Producer;
import org.kyojo.schemaorg.m3n4.core.Container.Provider;
import org.kyojo.schemaorg.m3n4.core.Container.Publication;
import org.kyojo.schemaorg.m3n4.core.Container.Publisher;
import org.kyojo.schemaorg.m3n4.core.Container.PublishingPrinciples;
import org.kyojo.schemaorg.m3n4.core.Container.RecordedAt;
import org.kyojo.schemaorg.m3n4.core.Container.RecordingOf;
import org.kyojo.schemaorg.m3n4.core.Container.ReleasedEvent;
import org.kyojo.schemaorg.m3n4.core.Container.Review;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.SchemaVersion;
import org.kyojo.schemaorg.m3n4.core.Container.SourceOrganization;
import org.kyojo.schemaorg.m3n4.core.Container.SpatialCoverage;
import org.kyojo.schemaorg.m3n4.core.Container.Sponsor;
import org.kyojo.schemaorg.m3n4.core.Container.TemporalCoverage;
import org.kyojo.schemaorg.m3n4.core.Container.Text;
import org.kyojo.schemaorg.m3n4.core.Container.ThumbnailUrl;
import org.kyojo.schemaorg.m3n4.core.Container.TimeRequired;
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
import org.kyojo.schemaorg.m3n4.pending.Container.Duration;
import org.kyojo.schemaorg.m3n4.pending.Container.SdDatePublished;
import org.kyojo.schemaorg.m3n4.pending.Container.SdLicense;
import org.kyojo.schemaorg.m3n4.pending.Container.SdPublisher;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;


public class MUSIC_RECORDING implements Clazz.MusicRecording {

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
	public ByArtist byArtist;
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
	public Duration duration;
	public Editor editor;
	public EducationalAlignment educationalAlignment;
	public EducationalUse educationalUse;
	public Encoding encoding;
	public EncodingFormat encodingFormat;
	public ExampleOfWork exampleOfWork;
	public Expires expires;
	public Funder funder;
	public Genre genre;
	public HasPart hasPart;
	public Headline headline;
	public Identifier identifier;
	public Image image;
	public InAlbum inAlbum;
	public InLanguage inLanguage;
	public InPlaylist inPlaylist;
	public InteractionStatistic interactionStatistic;
	public InteractivityType interactivityType;
	public IsAccessibleForFree isAccessibleForFree;
	public IsBasedOn isBasedOn;
	public IsFamilyFriendly isFamilyFriendly;
	public IsPartOf isPartOf;
	public IsrcCode isrcCode;
	public Keywords keywords;
	public LearningResourceType learningResourceType;
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
	public Position position;
	public PotentialAction potentialAction;
	public Producer producer;
	public Provider provider;
	public Publication publication;
	public Publisher publisher;
	public PublisherImprint publisherImprint;
	public PublishingPrinciples publishingPrinciples;
	public RecordedAt recordedAt;
	public RecordingOf recordingOf;
	public ReleasedEvent releasedEvent;
	public Review review;
	public SameAs sameAs;
	public SchemaVersion schemaVersion;
	public SdDatePublished sdDatePublished;
	public SdLicense sdLicense;
	public SdPublisher sdPublisher;
	public SourceOrganization sourceOrganization;
	public SpatialCoverage spatialCoverage;
	public Sponsor sponsor;
	public SubjectOf subjectOf;
	public TemporalCoverage temporalCoverage;
	public Text text;
	public ThumbnailUrl thumbnailUrl;
	public TimeRequired timeRequired;
	public TranslationOfWork translationOfWork;
	public Translator translator;
	public TypicalAgeRange typicalAgeRange;
	public Url url;
	public Version version;
	public Video video;
	public WorkExample workExample;
	public WorkTranslation workTranslation;

	public MUSIC_RECORDING() {
	}

	public MUSIC_RECORDING(Long seq) {
		setSeq(seq);
	}

	public MUSIC_RECORDING(String string) {
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

	public MUSIC_RECORDING(About about) {
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

	public MUSIC_RECORDING(AccessMode accessMode) {
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

	public MUSIC_RECORDING(AccessModeSufficient accessModeSufficient) {
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

	public MUSIC_RECORDING(AccessibilityAPI accessibilityAPI) {
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

	public MUSIC_RECORDING(AccessibilityControl accessibilityControl) {
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

	public MUSIC_RECORDING(AccessibilityFeature accessibilityFeature) {
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

	public MUSIC_RECORDING(AccessibilityHazard accessibilityHazard) {
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

	public MUSIC_RECORDING(AccessibilitySummary accessibilitySummary) {
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

	public MUSIC_RECORDING(AccountablePerson accountablePerson) {
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

	public MUSIC_RECORDING(AdditionalType additionalType) {
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

	public MUSIC_RECORDING(AggregateRating aggregateRating) {
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

	public MUSIC_RECORDING(AlternateName alternateName) {
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

	public MUSIC_RECORDING(AlternativeHeadline alternativeHeadline) {
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

	public MUSIC_RECORDING(AssociatedMedia associatedMedia) {
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

	public MUSIC_RECORDING(Audience audience) {
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

	public MUSIC_RECORDING(Audio audio) {
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

	public MUSIC_RECORDING(Author author) {
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

	public MUSIC_RECORDING(Award award) {
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

	public MUSIC_RECORDING(ByArtist byArtist) {
		setByArtist(byArtist);
	}

	@Override
	public ByArtist getByArtist() {
		return byArtist;
	}

	@Override
	public void setByArtist(ByArtist byArtist) {
		this.byArtist = byArtist;
	}

	public MUSIC_RECORDING(Character character) {
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

	public MUSIC_RECORDING(Citation citation) {
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

	public MUSIC_RECORDING(Comment comment) {
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

	public MUSIC_RECORDING(CommentCount commentCount) {
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

	public MUSIC_RECORDING(ContentLocation contentLocation) {
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

	public MUSIC_RECORDING(ContentRating contentRating) {
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

	public MUSIC_RECORDING(ContentReferenceTime contentReferenceTime) {
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

	public MUSIC_RECORDING(Contributor contributor) {
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

	public MUSIC_RECORDING(CopyrightHolder copyrightHolder) {
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

	public MUSIC_RECORDING(CopyrightYear copyrightYear) {
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

	public MUSIC_RECORDING(Correction correction) {
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

	public MUSIC_RECORDING(Creator creator) {
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

	public MUSIC_RECORDING(DateCreated dateCreated) {
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

	public MUSIC_RECORDING(DateModified dateModified) {
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

	public MUSIC_RECORDING(DatePublished datePublished) {
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

	public MUSIC_RECORDING(Description description) {
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

	public MUSIC_RECORDING(DisambiguatingDescription disambiguatingDescription) {
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

	public MUSIC_RECORDING(DiscussionUrl discussionUrl) {
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

	public MUSIC_RECORDING(Duration duration) {
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

	public MUSIC_RECORDING(Editor editor) {
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

	public MUSIC_RECORDING(EducationalAlignment educationalAlignment) {
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

	public MUSIC_RECORDING(EducationalUse educationalUse) {
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

	public MUSIC_RECORDING(Encoding encoding) {
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

	public MUSIC_RECORDING(EncodingFormat encodingFormat) {
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

	public MUSIC_RECORDING(ExampleOfWork exampleOfWork) {
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

	public MUSIC_RECORDING(Expires expires) {
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

	public MUSIC_RECORDING(Funder funder) {
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

	public MUSIC_RECORDING(Genre genre) {
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

	public MUSIC_RECORDING(HasPart hasPart) {
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

	public MUSIC_RECORDING(Headline headline) {
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

	public MUSIC_RECORDING(Identifier identifier) {
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

	public MUSIC_RECORDING(Image image) {
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

	public MUSIC_RECORDING(InAlbum inAlbum) {
		setInAlbum(inAlbum);
	}

	@Override
	public InAlbum getInAlbum() {
		return inAlbum;
	}

	@Override
	public void setInAlbum(InAlbum inAlbum) {
		this.inAlbum = inAlbum;
	}

	public MUSIC_RECORDING(InLanguage inLanguage) {
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

	public MUSIC_RECORDING(InPlaylist inPlaylist) {
		setInPlaylist(inPlaylist);
	}

	@Override
	public InPlaylist getInPlaylist() {
		return inPlaylist;
	}

	@Override
	public void setInPlaylist(InPlaylist inPlaylist) {
		this.inPlaylist = inPlaylist;
	}

	public MUSIC_RECORDING(InteractionStatistic interactionStatistic) {
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

	public MUSIC_RECORDING(InteractivityType interactivityType) {
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

	public MUSIC_RECORDING(IsAccessibleForFree isAccessibleForFree) {
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

	public MUSIC_RECORDING(IsBasedOn isBasedOn) {
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

	public MUSIC_RECORDING(IsFamilyFriendly isFamilyFriendly) {
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

	public MUSIC_RECORDING(IsPartOf isPartOf) {
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

	public MUSIC_RECORDING(IsrcCode isrcCode) {
		setIsrcCode(isrcCode);
	}

	@Override
	public IsrcCode getIsrcCode() {
		return isrcCode;
	}

	@Override
	public void setIsrcCode(IsrcCode isrcCode) {
		this.isrcCode = isrcCode;
	}

	public MUSIC_RECORDING(Keywords keywords) {
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

	public MUSIC_RECORDING(LearningResourceType learningResourceType) {
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

	public MUSIC_RECORDING(License license) {
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

	public MUSIC_RECORDING(LocationCreated locationCreated) {
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

	public MUSIC_RECORDING(MainEntity mainEntity) {
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

	public MUSIC_RECORDING(MainEntityOfPage mainEntityOfPage) {
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

	public MUSIC_RECORDING(Material material) {
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

	public MUSIC_RECORDING(Mentions mentions) {
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

	public MUSIC_RECORDING(Name name) {
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

	public MUSIC_RECORDING(NameFuzzy nameFuzzy) {
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

	public MUSIC_RECORDING(NameRuby nameRuby) {
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

	public MUSIC_RECORDING(Offers offers) {
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

	public MUSIC_RECORDING(Position position) {
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

	public MUSIC_RECORDING(PotentialAction potentialAction) {
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

	public MUSIC_RECORDING(Producer producer) {
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

	public MUSIC_RECORDING(Provider provider) {
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

	public MUSIC_RECORDING(Publication publication) {
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

	public MUSIC_RECORDING(Publisher publisher) {
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

	public MUSIC_RECORDING(PublisherImprint publisherImprint) {
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

	public MUSIC_RECORDING(PublishingPrinciples publishingPrinciples) {
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

	public MUSIC_RECORDING(RecordedAt recordedAt) {
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

	public MUSIC_RECORDING(RecordingOf recordingOf) {
		setRecordingOf(recordingOf);
	}

	@Override
	public RecordingOf getRecordingOf() {
		return recordingOf;
	}

	@Override
	public void setRecordingOf(RecordingOf recordingOf) {
		this.recordingOf = recordingOf;
	}

	public MUSIC_RECORDING(ReleasedEvent releasedEvent) {
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

	public MUSIC_RECORDING(Review review) {
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

	public MUSIC_RECORDING(SameAs sameAs) {
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

	public MUSIC_RECORDING(SchemaVersion schemaVersion) {
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

	public MUSIC_RECORDING(SdDatePublished sdDatePublished) {
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

	public MUSIC_RECORDING(SdLicense sdLicense) {
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

	public MUSIC_RECORDING(SdPublisher sdPublisher) {
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

	public MUSIC_RECORDING(SourceOrganization sourceOrganization) {
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

	public MUSIC_RECORDING(SpatialCoverage spatialCoverage) {
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

	public MUSIC_RECORDING(Sponsor sponsor) {
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

	public MUSIC_RECORDING(SubjectOf subjectOf) {
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

	public MUSIC_RECORDING(TemporalCoverage temporalCoverage) {
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

	public MUSIC_RECORDING(Text text) {
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

	public MUSIC_RECORDING(ThumbnailUrl thumbnailUrl) {
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

	public MUSIC_RECORDING(TimeRequired timeRequired) {
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

	public MUSIC_RECORDING(TranslationOfWork translationOfWork) {
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

	public MUSIC_RECORDING(Translator translator) {
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

	public MUSIC_RECORDING(TypicalAgeRange typicalAgeRange) {
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

	public MUSIC_RECORDING(Url url) {
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

	public MUSIC_RECORDING(Version version) {
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

	public MUSIC_RECORDING(Video video) {
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

	public MUSIC_RECORDING(WorkExample workExample) {
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

	public MUSIC_RECORDING(WorkTranslation workTranslation) {
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

	public MUSIC_RECORDING(Long seq,
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
			AssociatedMedia associatedMedia,
			Audience audience,
			Audio audio,
			Author author,
			Award award,
			ByArtist byArtist,
			Character character,
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
			Encoding encoding,
			EncodingFormat encodingFormat,
			ExampleOfWork exampleOfWork,
			Expires expires,
			Funder funder,
			Genre genre,
			HasPart hasPart,
			Headline headline,
			Identifier identifier,
			Image image,
			InAlbum inAlbum,
			InLanguage inLanguage,
			InPlaylist inPlaylist,
			InteractionStatistic interactionStatistic,
			InteractivityType interactivityType,
			IsAccessibleForFree isAccessibleForFree,
			IsBasedOn isBasedOn,
			IsFamilyFriendly isFamilyFriendly,
			IsPartOf isPartOf,
			IsrcCode isrcCode,
			Keywords keywords,
			LearningResourceType learningResourceType,
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
			Position position,
			PotentialAction potentialAction,
			Producer producer,
			Provider provider,
			Publication publication,
			Publisher publisher,
			PublisherImprint publisherImprint,
			PublishingPrinciples publishingPrinciples,
			RecordedAt recordedAt,
			RecordingOf recordingOf,
			ReleasedEvent releasedEvent,
			Review review,
			SameAs sameAs,
			SchemaVersion schemaVersion,
			SdDatePublished sdDatePublished,
			SdLicense sdLicense,
			SdPublisher sdPublisher,
			SourceOrganization sourceOrganization,
			SpatialCoverage spatialCoverage,
			Sponsor sponsor,
			SubjectOf subjectOf,
			TemporalCoverage temporalCoverage,
			Text text,
			ThumbnailUrl thumbnailUrl,
			TimeRequired timeRequired,
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
		setAdditionalType(additionalType);
		setAggregateRating(aggregateRating);
		setAlternateName(alternateName);
		setAlternativeHeadline(alternativeHeadline);
		setAssociatedMedia(associatedMedia);
		setAudience(audience);
		setAudio(audio);
		setAuthor(author);
		setAward(award);
		setByArtist(byArtist);
		setCharacter(character);
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
		setEncoding(encoding);
		setEncodingFormat(encodingFormat);
		setExampleOfWork(exampleOfWork);
		setExpires(expires);
		setFunder(funder);
		setGenre(genre);
		setHasPart(hasPart);
		setHeadline(headline);
		setIdentifier(identifier);
		setImage(image);
		setInAlbum(inAlbum);
		setInLanguage(inLanguage);
		setInPlaylist(inPlaylist);
		setInteractionStatistic(interactionStatistic);
		setInteractivityType(interactivityType);
		setIsAccessibleForFree(isAccessibleForFree);
		setIsBasedOn(isBasedOn);
		setIsFamilyFriendly(isFamilyFriendly);
		setIsPartOf(isPartOf);
		setIsrcCode(isrcCode);
		setKeywords(keywords);
		setLearningResourceType(learningResourceType);
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
		setPosition(position);
		setPotentialAction(potentialAction);
		setProducer(producer);
		setProvider(provider);
		setPublication(publication);
		setPublisher(publisher);
		setPublisherImprint(publisherImprint);
		setPublishingPrinciples(publishingPrinciples);
		setRecordedAt(recordedAt);
		setRecordingOf(recordingOf);
		setReleasedEvent(releasedEvent);
		setReview(review);
		setSameAs(sameAs);
		setSchemaVersion(schemaVersion);
		setSdDatePublished(sdDatePublished);
		setSdLicense(sdLicense);
		setSdPublisher(sdPublisher);
		setSourceOrganization(sourceOrganization);
		setSpatialCoverage(spatialCoverage);
		setSponsor(sponsor);
		setSubjectOf(subjectOf);
		setTemporalCoverage(temporalCoverage);
		setText(text);
		setThumbnailUrl(thumbnailUrl);
		setTimeRequired(timeRequired);
		setTranslationOfWork(translationOfWork);
		setTranslator(translator);
		setTypicalAgeRange(typicalAgeRange);
		setUrl(url);
		setVersion(version);
		setVideo(video);
		setWorkExample(workExample);
		setWorkTranslation(workTranslation);
	}

	public void copy(Clazz.MusicRecording org) {
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
		setByArtist(org.getByArtist());
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
		setDuration(org.getDuration());
		setEditor(org.getEditor());
		setEducationalAlignment(org.getEducationalAlignment());
		setEducationalUse(org.getEducationalUse());
		setEncoding(org.getEncoding());
		setEncodingFormat(org.getEncodingFormat());
		setExampleOfWork(org.getExampleOfWork());
		setExpires(org.getExpires());
		setFunder(org.getFunder());
		setGenre(org.getGenre());
		setHasPart(org.getHasPart());
		setHeadline(org.getHeadline());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setInAlbum(org.getInAlbum());
		setInLanguage(org.getInLanguage());
		setInPlaylist(org.getInPlaylist());
		setInteractionStatistic(org.getInteractionStatistic());
		setInteractivityType(org.getInteractivityType());
		setIsAccessibleForFree(org.getIsAccessibleForFree());
		setIsBasedOn(org.getIsBasedOn());
		setIsFamilyFriendly(org.getIsFamilyFriendly());
		setIsPartOf(org.getIsPartOf());
		setIsrcCode(org.getIsrcCode());
		setKeywords(org.getKeywords());
		setLearningResourceType(org.getLearningResourceType());
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
		setPosition(org.getPosition());
		setPotentialAction(org.getPotentialAction());
		setProducer(org.getProducer());
		setProvider(org.getProvider());
		setPublication(org.getPublication());
		setPublisher(org.getPublisher());
		setPublisherImprint(org.getPublisherImprint());
		setPublishingPrinciples(org.getPublishingPrinciples());
		setRecordedAt(org.getRecordedAt());
		setRecordingOf(org.getRecordingOf());
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
