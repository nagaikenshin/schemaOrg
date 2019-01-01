package org.kyojo.schemaorg.m3n4.bib;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.NativeValueText;
import org.kyojo.schemaorg.SchemaOrgClass;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n4.bib.Container;
import org.kyojo.schemaorg.m3n4.core.Clazz.AudioObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.Book;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.Periodical;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicationIssue;
import org.kyojo.schemaorg.m3n4.core.Clazz.VisualArtwork;
import org.kyojo.schemaorg.m3n4.core.Container.PageEnd;
import org.kyojo.schemaorg.m3n4.core.Container.PageStart;
import org.kyojo.schemaorg.m3n4.core.Container.Pagination;

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
	public interface Atlas extends CreativeWork, NativeValueText, SchemaOrgClass {

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
	public interface Audiobook extends AudioObject, Book, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/readBy">http://schema.org/readBy</a>
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
	public interface Chapter extends CreativeWork, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/pageEnd">http://schema.org/pageEnd</a>
		 */
		public PageEnd getPageEnd();
		public void setPageEnd(PageEnd pageEnd);

		/**
		 * @see <a href="http://schema.org/pageStart">http://schema.org/pageStart</a>
		 */
		public PageStart getPageStart();
		public void setPageStart(PageStart pageStart);

		/**
		 * @see <a href="http://schema.org/pagination">http://schema.org/pagination</a>
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
	public interface Collection extends CreativeWork, NativeValueText, SchemaOrgClass {

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
	public interface ComicCoverArt extends ComicStory, CoverArt, NativeValueText, SchemaOrgClass {

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
	public interface ComicIssue extends NativeValueText, PublicationIssue, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/artist">http://schema.org/artist</a>
		 */
		public Container.Artist getArtist();
		public void setArtist(Container.Artist artist);

		/**
		 * @see <a href="http://schema.org/colorist">http://schema.org/colorist</a>
		 */
		public Container.Colorist getColorist();
		public void setColorist(Container.Colorist colorist);

		/**
		 * @see <a href="http://schema.org/inker">http://schema.org/inker</a>
		 */
		public Container.Inker getInker();
		public void setInker(Container.Inker inker);

		/**
		 * @see <a href="http://schema.org/letterer">http://schema.org/letterer</a>
		 */
		public Container.Letterer getLetterer();
		public void setLetterer(Container.Letterer letterer);

		/**
		 * @see <a href="http://schema.org/penciler">http://schema.org/penciler</a>
		 */
		public Container.Penciler getPenciler();
		public void setPenciler(Container.Penciler penciler);

		/**
		 * @see <a href="http://schema.org/variantCover">http://schema.org/variantCover</a>
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
	public interface ComicSeries extends NativeValueText, Periodical, SchemaOrgClass {

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
	public interface ComicStory extends CreativeWork, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/artist">http://schema.org/artist</a>
		 */
		public Container.Artist getArtist();
		public void setArtist(Container.Artist artist);

		/**
		 * @see <a href="http://schema.org/colorist">http://schema.org/colorist</a>
		 */
		public Container.Colorist getColorist();
		public void setColorist(Container.Colorist colorist);

		/**
		 * @see <a href="http://schema.org/inker">http://schema.org/inker</a>
		 */
		public Container.Inker getInker();
		public void setInker(Container.Inker inker);

		/**
		 * @see <a href="http://schema.org/letterer">http://schema.org/letterer</a>
		 */
		public Container.Letterer getLetterer();
		public void setLetterer(Container.Letterer letterer);

		/**
		 * @see <a href="http://schema.org/penciler">http://schema.org/penciler</a>
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
	public interface CoverArt extends NativeValueText, SchemaOrgClass, VisualArtwork {

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
	public interface Newspaper extends NativeValueText, Periodical, SchemaOrgClass {

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
	public interface Thesis extends CreativeWork, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/inSupportOf">http://schema.org/inSupportOf</a>
		 */
		public Container.InSupportOf getInSupportOf();
		public void setInSupportOf(Container.InSupportOf inSupportOf);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

}
