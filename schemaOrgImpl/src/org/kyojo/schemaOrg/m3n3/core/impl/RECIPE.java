package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.bib.Container.PublisherImprint;
import org.kyojo.schemaOrg.m3n3.bib.Container.TranslationOfWork;
import org.kyojo.schemaOrg.m3n3.bib.Container.WorkTranslation;
import org.kyojo.schemaOrg.m3n3.core.Clazz;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Thing;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.About;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessMode;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessModeSufficient;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessibilityAPI;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessibilityControl;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessibilityFeature;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessibilityHazard;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessibilitySummary;
import org.kyojo.schemaOrg.m3n3.core.Container.AccountablePerson;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternativeHeadline;
import org.kyojo.schemaOrg.m3n3.core.Container.AssociatedMedia;
import org.kyojo.schemaOrg.m3n3.core.Container.Audience;
import org.kyojo.schemaOrg.m3n3.core.Container.Audio;
import org.kyojo.schemaOrg.m3n3.core.Container.Author;
import org.kyojo.schemaOrg.m3n3.core.Container.Award;
import org.kyojo.schemaOrg.m3n3.core.Container.Character;
import org.kyojo.schemaOrg.m3n3.core.Container.Citation;
import org.kyojo.schemaOrg.m3n3.core.Container.Comment;
import org.kyojo.schemaOrg.m3n3.core.Container.CommentCount;
import org.kyojo.schemaOrg.m3n3.core.Container.ContentLocation;
import org.kyojo.schemaOrg.m3n3.core.Container.ContentRating;
import org.kyojo.schemaOrg.m3n3.core.Container.Contributor;
import org.kyojo.schemaOrg.m3n3.core.Container.CookTime;
import org.kyojo.schemaOrg.m3n3.core.Container.CookingMethod;
import org.kyojo.schemaOrg.m3n3.core.Container.CopyrightHolder;
import org.kyojo.schemaOrg.m3n3.core.Container.CopyrightYear;
import org.kyojo.schemaOrg.m3n3.core.Container.Creator;
import org.kyojo.schemaOrg.m3n3.core.Container.DateCreated;
import org.kyojo.schemaOrg.m3n3.core.Container.DateModified;
import org.kyojo.schemaOrg.m3n3.core.Container.DatePublished;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.DiscussionUrl;
import org.kyojo.schemaOrg.m3n3.core.Container.Editor;
import org.kyojo.schemaOrg.m3n3.core.Container.EducationalAlignment;
import org.kyojo.schemaOrg.m3n3.core.Container.EducationalUse;
import org.kyojo.schemaOrg.m3n3.core.Container.Encoding;
import org.kyojo.schemaOrg.m3n3.core.Container.EstimatedCost;
import org.kyojo.schemaOrg.m3n3.core.Container.ExampleOfWork;
import org.kyojo.schemaOrg.m3n3.core.Container.Expires;
import org.kyojo.schemaOrg.m3n3.core.Container.FileFormat;
import org.kyojo.schemaOrg.m3n3.core.Container.Funder;
import org.kyojo.schemaOrg.m3n3.core.Container.Genre;
import org.kyojo.schemaOrg.m3n3.core.Container.HasPart;
import org.kyojo.schemaOrg.m3n3.core.Container.Headline;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.InLanguage;
import org.kyojo.schemaOrg.m3n3.core.Container.InteractionStatistic;
import org.kyojo.schemaOrg.m3n3.core.Container.InteractivityType;
import org.kyojo.schemaOrg.m3n3.core.Container.IsAccessibleForFree;
import org.kyojo.schemaOrg.m3n3.core.Container.IsBasedOn;
import org.kyojo.schemaOrg.m3n3.core.Container.IsFamilyFriendly;
import org.kyojo.schemaOrg.m3n3.core.Container.IsPartOf;
import org.kyojo.schemaOrg.m3n3.core.Container.Keywords;
import org.kyojo.schemaOrg.m3n3.core.Container.LearningResourceType;
import org.kyojo.schemaOrg.m3n3.core.Container.License;
import org.kyojo.schemaOrg.m3n3.core.Container.LocationCreated;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntity;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.Material;
import org.kyojo.schemaOrg.m3n3.core.Container.Mentions;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.Nutrition;
import org.kyojo.schemaOrg.m3n3.core.Container.Offers;
import org.kyojo.schemaOrg.m3n3.core.Container.PerformTime;
import org.kyojo.schemaOrg.m3n3.core.Container.Position;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.PrepTime;
import org.kyojo.schemaOrg.m3n3.core.Container.Producer;
import org.kyojo.schemaOrg.m3n3.core.Container.Provider;
import org.kyojo.schemaOrg.m3n3.core.Container.Publication;
import org.kyojo.schemaOrg.m3n3.core.Container.Publisher;
import org.kyojo.schemaOrg.m3n3.core.Container.PublishingPrinciples;
import org.kyojo.schemaOrg.m3n3.core.Container.RecipeCategory;
import org.kyojo.schemaOrg.m3n3.core.Container.RecipeCuisine;
import org.kyojo.schemaOrg.m3n3.core.Container.RecipeIngredient;
import org.kyojo.schemaOrg.m3n3.core.Container.RecipeInstructions;
import org.kyojo.schemaOrg.m3n3.core.Container.RecipeYield;
import org.kyojo.schemaOrg.m3n3.core.Container.RecordedAt;
import org.kyojo.schemaOrg.m3n3.core.Container.ReleasedEvent;
import org.kyojo.schemaOrg.m3n3.core.Container.Review;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.SchemaVersion;
import org.kyojo.schemaOrg.m3n3.core.Container.SourceOrganization;
import org.kyojo.schemaOrg.m3n3.core.Container.SpatialCoverage;
import org.kyojo.schemaOrg.m3n3.core.Container.Sponsor;
import org.kyojo.schemaOrg.m3n3.core.Container.Steps;
import org.kyojo.schemaOrg.m3n3.core.Container.SuitableForDiet;
import org.kyojo.schemaOrg.m3n3.core.Container.Supply;
import org.kyojo.schemaOrg.m3n3.core.Container.TemporalCoverage;
import org.kyojo.schemaOrg.m3n3.core.Container.Text;
import org.kyojo.schemaOrg.m3n3.core.Container.ThumbnailUrl;
import org.kyojo.schemaOrg.m3n3.core.Container.TimeRequired;
import org.kyojo.schemaOrg.m3n3.core.Container.Tool;
import org.kyojo.schemaOrg.m3n3.core.Container.TotalTime;
import org.kyojo.schemaOrg.m3n3.core.Container.Translator;
import org.kyojo.schemaOrg.m3n3.core.Container.TypicalAgeRange;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.Container.Version;
import org.kyojo.schemaOrg.m3n3.core.Container.Video;
import org.kyojo.schemaOrg.m3n3.core.Container.WorkExample;
import org.kyojo.schemaOrg.m3n3.core.Container.Yield;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;
import org.kyojo.schemaOrg.m3n3.pending.Container.ContentReferenceTime;

public class RECIPE implements Clazz.Recipe, Container.Recipe {

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
	public CookTime cookTime;
	public CookingMethod cookingMethod;
	public CopyrightHolder copyrightHolder;
	public CopyrightYear copyrightYear;
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
	public EstimatedCost estimatedCost;
	public ExampleOfWork exampleOfWork;
	public Expires expires;
	public FileFormat fileFormat;
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
	public Mentions mentions;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Nutrition nutrition;
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
	public List<Clazz.Recipe> recipeList;
	public RecipeCategory recipeCategory;
	public RecipeCuisine recipeCuisine;
	public RecipeIngredient recipeIngredient;
	public RecipeInstructions recipeInstructions;
	public RecipeYield recipeYield;
	public RecordedAt recordedAt;
	public ReleasedEvent releasedEvent;
	public Review review;
	public SameAs sameAs;
	public SchemaVersion schemaVersion;
	public SourceOrganization sourceOrganization;
	public SpatialCoverage spatialCoverage;
	public Sponsor sponsor;
	public Steps steps;
	public SuitableForDiet suitableForDiet;
	public Supply supply;
	public TemporalCoverage temporalCoverage;
	public Text text;
	public List<Thing> thingList;
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

	public RECIPE() {
	}

	public RECIPE(Long seq) {
		setSeq(seq);
	}

	public RECIPE(String string) {
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

	public RECIPE(About about) {
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

	public RECIPE(AccessMode accessMode) {
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

	public RECIPE(AccessModeSufficient accessModeSufficient) {
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

	public RECIPE(AccessibilityAPI accessibilityAPI) {
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

	public RECIPE(AccessibilityControl accessibilityControl) {
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

	public RECIPE(AccessibilityFeature accessibilityFeature) {
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

	public RECIPE(AccessibilityHazard accessibilityHazard) {
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

	public RECIPE(AccessibilitySummary accessibilitySummary) {
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

	public RECIPE(AccountablePerson accountablePerson) {
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

	public RECIPE(AdditionalType additionalType) {
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

	public RECIPE(AggregateRating aggregateRating) {
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

	public RECIPE(AlternateName alternateName) {
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

	public RECIPE(AlternativeHeadline alternativeHeadline) {
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

	public RECIPE(AssociatedMedia associatedMedia) {
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

	public RECIPE(Audience audience) {
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

	public RECIPE(Audio audio) {
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

	public RECIPE(Author author) {
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

	public RECIPE(Award award) {
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

	public RECIPE(Character character) {
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

	public RECIPE(Citation citation) {
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

	public RECIPE(Comment comment) {
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

	public RECIPE(CommentCount commentCount) {
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

	public RECIPE(ContentLocation contentLocation) {
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

	public RECIPE(ContentRating contentRating) {
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

	public RECIPE(ContentReferenceTime contentReferenceTime) {
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

	public RECIPE(Contributor contributor) {
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

	public RECIPE(CookTime cookTime) {
		setCookTime(cookTime);
	}

	@Override
	public CookTime getCookTime() {
		return cookTime;
	}

	@Override
	public void setCookTime(CookTime cookTime) {
		this.cookTime = cookTime;
	}

	public RECIPE(CookingMethod cookingMethod) {
		setCookingMethod(cookingMethod);
	}

	@Override
	public CookingMethod getCookingMethod() {
		return cookingMethod;
	}

	@Override
	public void setCookingMethod(CookingMethod cookingMethod) {
		this.cookingMethod = cookingMethod;
	}

	public RECIPE(CopyrightHolder copyrightHolder) {
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

	public RECIPE(CopyrightYear copyrightYear) {
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

	public RECIPE(Creator creator) {
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

	public RECIPE(DateCreated dateCreated) {
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

	public RECIPE(DateModified dateModified) {
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

	public RECIPE(DatePublished datePublished) {
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

	public RECIPE(Description description) {
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

	public RECIPE(DisambiguatingDescription disambiguatingDescription) {
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

	public RECIPE(DiscussionUrl discussionUrl) {
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

	public RECIPE(Editor editor) {
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

	public RECIPE(EducationalAlignment educationalAlignment) {
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

	public RECIPE(EducationalUse educationalUse) {
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

	public RECIPE(Encoding encoding) {
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

	public RECIPE(EstimatedCost estimatedCost) {
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

	public RECIPE(ExampleOfWork exampleOfWork) {
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

	public RECIPE(Expires expires) {
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

	public RECIPE(FileFormat fileFormat) {
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

	public RECIPE(Funder funder) {
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

	public RECIPE(Genre genre) {
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

	public RECIPE(HasPart hasPart) {
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

	public RECIPE(Headline headline) {
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

	public RECIPE(Identifier identifier) {
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

	public RECIPE(Image image) {
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

	public RECIPE(InLanguage inLanguage) {
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

	public RECIPE(InteractionStatistic interactionStatistic) {
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

	public RECIPE(InteractivityType interactivityType) {
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

	public RECIPE(IsAccessibleForFree isAccessibleForFree) {
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

	public RECIPE(IsBasedOn isBasedOn) {
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

	public RECIPE(IsFamilyFriendly isFamilyFriendly) {
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

	public RECIPE(IsPartOf isPartOf) {
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

	public RECIPE(Keywords keywords) {
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

	public RECIPE(LearningResourceType learningResourceType) {
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

	public RECIPE(License license) {
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

	public RECIPE(LocationCreated locationCreated) {
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

	public RECIPE(MainEntity mainEntity) {
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

	public RECIPE(MainEntityOfPage mainEntityOfPage) {
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

	public RECIPE(Material material) {
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

	public RECIPE(Mentions mentions) {
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

	public RECIPE(Name name) {
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

	public RECIPE(NameFuzzy nameFuzzy) {
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

	public RECIPE(NameRuby nameRuby) {
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

	public RECIPE(Nutrition nutrition) {
		setNutrition(nutrition);
	}

	@Override
	public Nutrition getNutrition() {
		return nutrition;
	}

	@Override
	public void setNutrition(Nutrition nutrition) {
		this.nutrition = nutrition;
	}

	public RECIPE(Offers offers) {
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

	public RECIPE(PerformTime performTime) {
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

	public RECIPE(Position position) {
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

	public RECIPE(PotentialAction potentialAction) {
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

	public RECIPE(PrepTime prepTime) {
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

	public RECIPE(Producer producer) {
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

	public RECIPE(Provider provider) {
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

	public RECIPE(Publication publication) {
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

	public RECIPE(Publisher publisher) {
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

	public RECIPE(PublisherImprint publisherImprint) {
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

	public RECIPE(PublishingPrinciples publishingPrinciples) {
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

	public RECIPE(Clazz.Recipe recipe) {
		recipeList = new ArrayList<Clazz.Recipe>();
		recipeList.add(recipe);
	}

	@Override
	public Clazz.Recipe getRecipe() {
		if(recipeList != null && recipeList.size() > 0) {
			return recipeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRecipe(Clazz.Recipe recipe) {
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
	public List<Clazz.Recipe> getRecipeList() {
		return recipeList;
	}

	@Override
	public void setRecipeList(List<Clazz.Recipe> recipeList) {
		this.recipeList = recipeList;
	}

	@Override
	public boolean hasRecipe() {
		return recipeList != null && recipeList.size() > 0 && recipeList.get(0) != null;
	}

	public RECIPE(RecipeCategory recipeCategory) {
		setRecipeCategory(recipeCategory);
	}

	@Override
	public RecipeCategory getRecipeCategory() {
		return recipeCategory;
	}

	@Override
	public void setRecipeCategory(RecipeCategory recipeCategory) {
		this.recipeCategory = recipeCategory;
	}

	public RECIPE(RecipeCuisine recipeCuisine) {
		setRecipeCuisine(recipeCuisine);
	}

	@Override
	public RecipeCuisine getRecipeCuisine() {
		return recipeCuisine;
	}

	@Override
	public void setRecipeCuisine(RecipeCuisine recipeCuisine) {
		this.recipeCuisine = recipeCuisine;
	}

	public RECIPE(RecipeIngredient recipeIngredient) {
		setRecipeIngredient(recipeIngredient);
	}

	@Override
	public RecipeIngredient getRecipeIngredient() {
		return recipeIngredient;
	}

	@Override
	public void setRecipeIngredient(RecipeIngredient recipeIngredient) {
		this.recipeIngredient = recipeIngredient;
	}

	public RECIPE(RecipeInstructions recipeInstructions) {
		setRecipeInstructions(recipeInstructions);
	}

	@Override
	public RecipeInstructions getRecipeInstructions() {
		return recipeInstructions;
	}

	@Override
	public void setRecipeInstructions(RecipeInstructions recipeInstructions) {
		this.recipeInstructions = recipeInstructions;
	}

	public RECIPE(RecipeYield recipeYield) {
		setRecipeYield(recipeYield);
	}

	@Override
	public RecipeYield getRecipeYield() {
		return recipeYield;
	}

	@Override
	public void setRecipeYield(RecipeYield recipeYield) {
		this.recipeYield = recipeYield;
	}

	public RECIPE(RecordedAt recordedAt) {
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

	public RECIPE(ReleasedEvent releasedEvent) {
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

	public RECIPE(Review review) {
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

	public RECIPE(SameAs sameAs) {
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

	public RECIPE(SchemaVersion schemaVersion) {
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

	public RECIPE(SourceOrganization sourceOrganization) {
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

	public RECIPE(SpatialCoverage spatialCoverage) {
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

	public RECIPE(Sponsor sponsor) {
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

	public RECIPE(Steps steps) {
		setSteps(steps);
	}

	@Override
	public Steps getSteps() {
		return steps;
	}

	@Override
	public void setSteps(Steps steps) {
		this.steps = steps;
	}

	public RECIPE(SuitableForDiet suitableForDiet) {
		setSuitableForDiet(suitableForDiet);
	}

	@Override
	public SuitableForDiet getSuitableForDiet() {
		return suitableForDiet;
	}

	@Override
	public void setSuitableForDiet(SuitableForDiet suitableForDiet) {
		this.suitableForDiet = suitableForDiet;
	}

	public RECIPE(Supply supply) {
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

	public RECIPE(TemporalCoverage temporalCoverage) {
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

	public RECIPE(Text text) {
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

	public RECIPE(Thing thing) {
		thingList = new ArrayList<Thing>();
		thingList.add(thing);
	}

	@Override
	public Thing getThing() {
		if(thingList != null && thingList.size() > 0) {
			return thingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setThing(Thing thing) {
		if(thingList == null) {
			thingList = new ArrayList<>();
		}
		if(thingList.size() == 0) {
			thingList.add(thing);
		} else {
			thingList.set(0, thing);
		}
	}

	@Override
	public List<Thing> getThingList() {
		return thingList;
	}

	@Override
	public void setThingList(List<Thing> thingList) {
		this.thingList = thingList;
	}

	@Override
	public boolean hasThing() {
		return thingList != null && thingList.size() > 0 && thingList.get(0) != null;
	}

	public RECIPE(ThumbnailUrl thumbnailUrl) {
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

	public RECIPE(TimeRequired timeRequired) {
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

	public RECIPE(Tool tool) {
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

	public RECIPE(TotalTime totalTime) {
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

	public RECIPE(TranslationOfWork translationOfWork) {
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

	public RECIPE(Translator translator) {
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

	public RECIPE(TypicalAgeRange typicalAgeRange) {
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

	public RECIPE(Url url) {
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

	public RECIPE(Version version) {
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

	public RECIPE(Video video) {
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

	public RECIPE(WorkExample workExample) {
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

	public RECIPE(WorkTranslation workTranslation) {
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

	public RECIPE(Yield yield) {
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

	public RECIPE(Long seq,
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
			Character character,
			Citation citation,
			Comment comment,
			CommentCount commentCount,
			ContentLocation contentLocation,
			ContentRating contentRating,
			ContentReferenceTime contentReferenceTime,
			Contributor contributor,
			CookTime cookTime,
			CookingMethod cookingMethod,
			CopyrightHolder copyrightHolder,
			CopyrightYear copyrightYear,
			Creator creator,
			DateCreated dateCreated,
			DateModified dateModified,
			DatePublished datePublished,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			DiscussionUrl discussionUrl,
			Editor editor,
			EducationalAlignment educationalAlignment,
			EducationalUse educationalUse,
			Encoding encoding,
			EstimatedCost estimatedCost,
			ExampleOfWork exampleOfWork,
			Expires expires,
			FileFormat fileFormat,
			Funder funder,
			Genre genre,
			HasPart hasPart,
			Headline headline,
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
			License license,
			LocationCreated locationCreated,
			MainEntity mainEntity,
			MainEntityOfPage mainEntityOfPage,
			Material material,
			Mentions mentions,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			Nutrition nutrition,
			Offers offers,
			PerformTime performTime,
			Position position,
			PotentialAction potentialAction,
			PrepTime prepTime,
			Producer producer,
			Provider provider,
			Publication publication,
			Publisher publisher,
			PublisherImprint publisherImprint,
			PublishingPrinciples publishingPrinciples,
			List<Clazz.Recipe> recipeList,
			RecipeCategory recipeCategory,
			RecipeCuisine recipeCuisine,
			RecipeIngredient recipeIngredient,
			RecipeInstructions recipeInstructions,
			RecipeYield recipeYield,
			RecordedAt recordedAt,
			ReleasedEvent releasedEvent,
			Review review,
			SameAs sameAs,
			SchemaVersion schemaVersion,
			SourceOrganization sourceOrganization,
			SpatialCoverage spatialCoverage,
			Sponsor sponsor,
			Steps steps,
			SuitableForDiet suitableForDiet,
			Supply supply,
			TemporalCoverage temporalCoverage,
			Text text,
			List<Thing> thingList,
			ThumbnailUrl thumbnailUrl,
			TimeRequired timeRequired,
			Tool tool,
			TotalTime totalTime,
			TranslationOfWork translationOfWork,
			Translator translator,
			TypicalAgeRange typicalAgeRange,
			Url url,
			Version version,
			Video video,
			WorkExample workExample,
			WorkTranslation workTranslation,
			Yield yield) {
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
		setCharacter(character);
		setCitation(citation);
		setComment(comment);
		setCommentCount(commentCount);
		setContentLocation(contentLocation);
		setContentRating(contentRating);
		setContentReferenceTime(contentReferenceTime);
		setContributor(contributor);
		setCookTime(cookTime);
		setCookingMethod(cookingMethod);
		setCopyrightHolder(copyrightHolder);
		setCopyrightYear(copyrightYear);
		setCreator(creator);
		setDateCreated(dateCreated);
		setDateModified(dateModified);
		setDatePublished(datePublished);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setDiscussionUrl(discussionUrl);
		setEditor(editor);
		setEducationalAlignment(educationalAlignment);
		setEducationalUse(educationalUse);
		setEncoding(encoding);
		setEstimatedCost(estimatedCost);
		setExampleOfWork(exampleOfWork);
		setExpires(expires);
		setFileFormat(fileFormat);
		setFunder(funder);
		setGenre(genre);
		setHasPart(hasPart);
		setHeadline(headline);
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
		setLicense(license);
		setLocationCreated(locationCreated);
		setMainEntity(mainEntity);
		setMainEntityOfPage(mainEntityOfPage);
		setMaterial(material);
		setMentions(mentions);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setNutrition(nutrition);
		setOffers(offers);
		setPerformTime(performTime);
		setPosition(position);
		setPotentialAction(potentialAction);
		setPrepTime(prepTime);
		setProducer(producer);
		setProvider(provider);
		setPublication(publication);
		setPublisher(publisher);
		setPublisherImprint(publisherImprint);
		setPublishingPrinciples(publishingPrinciples);
		setRecipeList(recipeList);
		setRecipeCategory(recipeCategory);
		setRecipeCuisine(recipeCuisine);
		setRecipeIngredient(recipeIngredient);
		setRecipeInstructions(recipeInstructions);
		setRecipeYield(recipeYield);
		setRecordedAt(recordedAt);
		setReleasedEvent(releasedEvent);
		setReview(review);
		setSameAs(sameAs);
		setSchemaVersion(schemaVersion);
		setSourceOrganization(sourceOrganization);
		setSpatialCoverage(spatialCoverage);
		setSponsor(sponsor);
		setSteps(steps);
		setSuitableForDiet(suitableForDiet);
		setSupply(supply);
		setTemporalCoverage(temporalCoverage);
		setText(text);
		setThingList(thingList);
		setThumbnailUrl(thumbnailUrl);
		setTimeRequired(timeRequired);
		setTool(tool);
		setTotalTime(totalTime);
		setTranslationOfWork(translationOfWork);
		setTranslator(translator);
		setTypicalAgeRange(typicalAgeRange);
		setUrl(url);
		setVersion(version);
		setVideo(video);
		setWorkExample(workExample);
		setWorkTranslation(workTranslation);
		setYield(yield);
	}

	public void copy(Clazz.Recipe org) {
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
		setCookTime(org.getCookTime());
		setCookingMethod(org.getCookingMethod());
		setCopyrightHolder(org.getCopyrightHolder());
		setCopyrightYear(org.getCopyrightYear());
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
		setEstimatedCost(org.getEstimatedCost());
		setExampleOfWork(org.getExampleOfWork());
		setExpires(org.getExpires());
		setFileFormat(org.getFileFormat());
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
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setNutrition(org.getNutrition());
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
		setRecipeCategory(org.getRecipeCategory());
		setRecipeCuisine(org.getRecipeCuisine());
		setRecipeIngredient(org.getRecipeIngredient());
		setRecipeInstructions(org.getRecipeInstructions());
		setRecipeYield(org.getRecipeYield());
		setRecordedAt(org.getRecordedAt());
		setReleasedEvent(org.getReleasedEvent());
		setReview(org.getReview());
		setSameAs(org.getSameAs());
		setSchemaVersion(org.getSchemaVersion());
		setSourceOrganization(org.getSourceOrganization());
		setSpatialCoverage(org.getSpatialCoverage());
		setSponsor(org.getSponsor());
		setSteps(org.getSteps());
		setSuitableForDiet(org.getSuitableForDiet());
		setSupply(org.getSupply());
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

	public void copy(Container.Recipe org) {
		setRecipeList(org.getRecipeList());
		setThingList(org.getThingList());
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