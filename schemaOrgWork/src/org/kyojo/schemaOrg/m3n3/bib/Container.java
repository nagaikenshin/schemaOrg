package org.kyojo.schemaOrg.m3n3.bib;

import java.util.List;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgProperty;
import org.kyojo.schemaOrg.SchemaOrgURI;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Organization;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Person;
import org.kyojo.schemaOrg.m3n3.core.Container.Actor;
import org.kyojo.schemaOrg.m3n3.core.DataType.Boolean;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property")
@CamelizedName("container")
@ConstantizedName("CONTAINER")
public interface Container extends SchemaOrgProperty {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/abridged")
	@SchemaOrgLabel("abridged")
	@SchemaOrgComment(""
			+ "Indicates whether the book is an abridged edition.")
	@CamelizedName("abridged")
	@ConstantizedName("ABRIDGED")
	public interface Abridged extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/artist")
	@SchemaOrgLabel("artist")
	@SchemaOrgComment(""
			+ "The primary artist for a work\n    in a medium other than pencils or digital"
			+ " line art--for example, if the\n    primary artwork is done in watercolors or"
			+ " digital paints.")
	@CamelizedName("artist")
	@ConstantizedName("ARTIST")
	public interface Artist extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/colorist")
	@SchemaOrgLabel("colorist")
	@SchemaOrgComment(""
			+ "The individual who adds color to inked drawings.")
	@CamelizedName("colorist")
	@ConstantizedName("COLORIST")
	public interface Colorist extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/inSupportOf")
	@SchemaOrgLabel("inSupportOf")
	@SchemaOrgComment(""
			+ "Qualification, candidature, degree, application that Thesis supports.")
	@CamelizedName("inSupportOf")
	@ConstantizedName("IN_SUPPORT_OF")
	public interface InSupportOf extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/inker")
	@SchemaOrgLabel("inker")
	@SchemaOrgComment(""
			+ "The individual who traces over the pencil drawings in ink after pencils are"
			+ " complete.")
	@CamelizedName("inker")
	@ConstantizedName("INKER")
	public interface Inker extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/letterer")
	@SchemaOrgLabel("letterer")
	@SchemaOrgComment(""
			+ "The individual who adds lettering, including speech balloons and sound effects,"
			+ " to artwork.")
	@CamelizedName("letterer")
	@ConstantizedName("LETTERER")
	public interface Letterer extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/penciler")
	@SchemaOrgLabel("penciler")
	@SchemaOrgComment(""
			+ "The individual who draws the primary narrative artwork.")
	@CamelizedName("penciler")
	@ConstantizedName("PENCILER")
	public interface Penciler extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/publishedBy")
	@SchemaOrgLabel("publishedBy")
	@SchemaOrgComment(""
			+ "An agent associated with the publication event.")
	@CamelizedName("publishedBy")
	@ConstantizedName("PUBLISHED_BY")
	public interface PublishedBy extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/publisherImprint")
	@SchemaOrgLabel("publisherImprint")
	@SchemaOrgComment(""
			+ "The publishing division which published the comic.")
	@CamelizedName("publisherImprint")
	@ConstantizedName("PUBLISHER_IMPRINT")
	public interface PublisherImprint extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/readBy")
	@SchemaOrgLabel("readBy")
	@SchemaOrgComment(""
			+ "A person who reads (performs) the audiobook.")
	@CamelizedName("readBy")
	@ConstantizedName("READ_BY")
	public interface ReadBy extends Actor, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/translationOfWork")
	@SchemaOrgLabel("translationOfWork")
	@SchemaOrgComment(""
			+ "The work that this work has been translated from. e.g. 物种起源 is a translationOf"
			+ " “On the Origin of Species”")
	@CamelizedName("translationOfWork")
	@ConstantizedName("TRANSLATION_OF_WORK")
	public interface TranslationOfWork extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/variantCover")
	@SchemaOrgLabel("variantCover")
	@SchemaOrgComment(""
			+ "A description of the variant cover\n    for the issue, if the issue is a variant"
			+ " printing. For example, \"Bryan Hitch\n    Variant Cover\" or \"2nd Printing"
			+ " Variant\".")
	@CamelizedName("variantCover")
	@ConstantizedName("VARIANT_COVER")
	public interface VariantCover extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/workTranslation")
	@SchemaOrgLabel("workTranslation")
	@SchemaOrgComment(""
			+ "A work that is a translation of the content of this work. e.g. 西遊記 has an"
			+ " English workTranslation “Journey to the West”,a German workTranslation “Monkeys"
			+ " Pilgerfahrt” and a Vietnamese  translation Tây du ký bình khảo.")
	@CamelizedName("workTranslation")
	@ConstantizedName("WORK_TRANSLATION")
	public interface WorkTranslation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

}
