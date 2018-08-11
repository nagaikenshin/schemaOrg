package org.kyojo.schemaOrg.m3n3.bib;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SchemaOrgClass;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;
import org.kyojo.schemaOrg.m3n3.bib.Container;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AudioObject;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Book;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Periodical;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PublicationIssue;
import org.kyojo.schemaOrg.m3n3.core.Clazz.VisualArtwork;
import org.kyojo.schemaOrg.m3n3.core.Container.PageEnd;
import org.kyojo.schemaOrg.m3n3.core.Container.PageStart;
import org.kyojo.schemaOrg.m3n3.core.Container.Pagination;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/2000/01/rdf-schema#Class")
@CamelizedName("clazz")
@ConstantizedName("CLAZZ")
public interface Clazz extends SchemaOrgClass {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Atlas")
	@SchemaOrgLabel("Atlas")
	@SchemaOrgComment(""
			+ "A collection or bound volume of maps, charts, plates or tables, physical or in"
			+ " media form illustrating any subject.")
	@CamelizedName("atlas")
	@ConstantizedName("ATLAS")
	public interface Atlas extends CreativeWork, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Audiobook")
	@SchemaOrgLabel("Audiobook")
	@SchemaOrgComment("An audiobook.")
	@CamelizedName("audiobook")
	@ConstantizedName("AUDIOBOOK")
	public interface Audiobook extends AudioObject, Book, SchemaOrgClass {

		/**
		 * uri: http://schema.org/readBy
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.ReadBy
		 */
		public Container.ReadBy getReadBy();
		public void setReadBy(Container.ReadBy readBy);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Chapter")
	@SchemaOrgLabel("Chapter")
	@SchemaOrgComment(""
			+ "One of the sections into which a book is divided. A chapter usually has a"
			+ " section number or a name.")
	@CamelizedName("chapter")
	@ConstantizedName("CHAPTER")
	public interface Chapter extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/pageEnd
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PageEnd
		 */
		public PageEnd getPageEnd();
		public void setPageEnd(PageEnd pageEnd);

		/**
		 * uri: http://schema.org/pageStart
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PageStart
		 */
		public PageStart getPageStart();
		public void setPageStart(PageStart pageStart);

		/**
		 * uri: http://schema.org/pagination
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Pagination
		 */
		public Pagination getPagination();
		public void setPagination(Pagination pagination);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Collection")
	@SchemaOrgLabel("Collection")
	@SchemaOrgComment(""
			+ "A created collection of Creative Works or other artefacts.")
	@CamelizedName("collection")
	@ConstantizedName("COLLECTION")
	public interface Collection extends CreativeWork, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ComicCoverArt")
	@SchemaOrgLabel("ComicCoverArt")
	@SchemaOrgComment("The artwork on the cover of a comic.")
	@CamelizedName("comicCoverArt")
	@ConstantizedName("COMIC_COVER_ART")
	public interface ComicCoverArt extends ComicStory, CoverArt, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ComicIssue")
	@SchemaOrgLabel("ComicIssue")
	@SchemaOrgComment(""
			+ "Individual comic issues are serially published as\n    part of a larger series."
			+ " For the sake of consistency, even one-shot issues\n    belong to a series"
			+ " comprised of a single issue. All comic issues can be\n    uniquely identified"
			+ " by: the combination of the name and volume number of the\n    series to which"
			+ " the issue belongs; the issue number; and the variant\n    description of the"
			+ " issue (if any).")
	@CamelizedName("comicIssue")
	@ConstantizedName("COMIC_ISSUE")
	public interface ComicIssue extends PublicationIssue, SchemaOrgClass {

		/**
		 * uri: http://schema.org/artist
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Artist
		 */
		public Container.Artist getArtist();
		public void setArtist(Container.Artist artist);

		/**
		 * uri: http://schema.org/colorist
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Colorist
		 */
		public Container.Colorist getColorist();
		public void setColorist(Container.Colorist colorist);

		/**
		 * uri: http://schema.org/inker
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Inker
		 */
		public Container.Inker getInker();
		public void setInker(Container.Inker inker);

		/**
		 * uri: http://schema.org/letterer
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Letterer
		 */
		public Container.Letterer getLetterer();
		public void setLetterer(Container.Letterer letterer);

		/**
		 * uri: http://schema.org/penciler
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Penciler
		 */
		public Container.Penciler getPenciler();
		public void setPenciler(Container.Penciler penciler);

		/**
		 * uri: http://schema.org/variantCover
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.VariantCover
		 */
		public Container.VariantCover getVariantCover();
		public void setVariantCover(Container.VariantCover variantCover);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ComicSeries")
	@SchemaOrgLabel("ComicSeries")
	@SchemaOrgComment(""
			+ "A sequential publication of comic stories under a\n    unifying title, for"
			+ " example \"The Amazing Spider-Man\" or \"Groo the\n    Wanderer\".")
	@CamelizedName("comicSeries")
	@ConstantizedName("COMIC_SERIES")
	public interface ComicSeries extends Periodical, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ComicStory")
	@SchemaOrgLabel("ComicStory")
	@SchemaOrgComment(""
			+ "The term \"story\" is any indivisible, re-printable\n    unit of a comic,"
			+ " including the interior stories, covers, and backmatter. Most\n    comics have"
			+ " at least two stories: a cover (ComicCoverArt) and an interior story.")
	@CamelizedName("comicStory")
	@ConstantizedName("COMIC_STORY")
	public interface ComicStory extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/artist
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Artist
		 */
		public Container.Artist getArtist();
		public void setArtist(Container.Artist artist);

		/**
		 * uri: http://schema.org/colorist
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Colorist
		 */
		public Container.Colorist getColorist();
		public void setColorist(Container.Colorist colorist);

		/**
		 * uri: http://schema.org/inker
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Inker
		 */
		public Container.Inker getInker();
		public void setInker(Container.Inker inker);

		/**
		 * uri: http://schema.org/letterer
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Letterer
		 */
		public Container.Letterer getLetterer();
		public void setLetterer(Container.Letterer letterer);

		/**
		 * uri: http://schema.org/penciler
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Penciler
		 */
		public Container.Penciler getPenciler();
		public void setPenciler(Container.Penciler penciler);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CoverArt")
	@SchemaOrgLabel("CoverArt")
	@SchemaOrgComment(""
			+ "The artwork on the outer surface of a CreativeWork.")
	@CamelizedName("coverArt")
	@ConstantizedName("COVER_ART")
	public interface CoverArt extends SchemaOrgClass, VisualArtwork {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Newspaper")
	@SchemaOrgLabel("Newspaper")
	@SchemaOrgComment(""
			+ "A publication containing information about varied topics that are pertinent to"
			+ " general information, a geographic area, or a specific subject matter (i.e."
			+ " business, culture, education). Often published daily.")
	@CamelizedName("newspaper")
	@ConstantizedName("NEWSPAPER")
	public interface Newspaper extends Periodical, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Thesis")
	@SchemaOrgLabel("Thesis")
	@SchemaOrgComment(""
			+ "A thesis or dissertation document submitted in support of candidature for an"
			+ " academic degree or professional qualification.")
	@CamelizedName("thesis")
	@ConstantizedName("THESIS")
	public interface Thesis extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/inSupportOf
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.InSupportOf
		 */
		public Container.InSupportOf getInSupportOf();
		public void setInSupportOf(Container.InSupportOf inSupportOf);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

}
