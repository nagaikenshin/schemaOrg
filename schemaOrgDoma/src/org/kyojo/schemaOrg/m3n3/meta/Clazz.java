package org.kyojo.schemaOrg.m3n3.meta;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SchemaOrgClass;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Intangible;
import org.kyojo.schemaOrg.m3n3.core.Container.Category;
import org.kyojo.schemaOrg.m3n3.meta.Container;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/2000/01/rdf-schema#Class")
@CamelizedName("clazz")
@ConstantizedName("CLAZZ")
public interface Clazz extends SchemaOrgClass {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Class")
	@SchemaOrgLabel("Class")
	@SchemaOrgComment(""
			+ "A class, also often called a 'Type'; equivalent to rdfs:Class.")
	@CamelizedName("class")
	@ConstantizedName("CLASS")
	public interface Class extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/category
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Category
		 */
		public Category getCategory();
		public void setCategory(Category category);

		/**
		 * uri: http://schema.org/supersededBy
		 * class: org.kyojo.schemaOrg.m3n3.meta.Container.SupersededBy
		 */
		public Container.SupersededBy getSupersededBy();
		public void setSupersededBy(Container.SupersededBy supersededBy);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Property")
	@SchemaOrgLabel("Property")
	@SchemaOrgComment(""
			+ "A property, used to indicate attributes and relationships of some Thing;"
			+ " equivalent to rdf:Property.")
	@CamelizedName("property")
	@ConstantizedName("PROPERTY")
	public interface Property extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/category
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Category
		 */
		public Category getCategory();
		public void setCategory(Category category);

		/**
		 * uri: http://schema.org/domainIncludes
		 * class: org.kyojo.schemaOrg.m3n3.meta.Container.DomainIncludes
		 */
		public Container.DomainIncludes getDomainIncludes();
		public void setDomainIncludes(Container.DomainIncludes domainIncludes);

		/**
		 * uri: http://schema.org/inverseOf
		 * class: org.kyojo.schemaOrg.m3n3.meta.Container.InverseOf
		 */
		public Container.InverseOf getInverseOf();
		public void setInverseOf(Container.InverseOf inverseOf);

		/**
		 * uri: http://schema.org/rangeIncludes
		 * class: org.kyojo.schemaOrg.m3n3.meta.Container.RangeIncludes
		 */
		public Container.RangeIncludes getRangeIncludes();
		public void setRangeIncludes(Container.RangeIncludes rangeIncludes);

		/**
		 * uri: http://schema.org/supersededBy
		 * class: org.kyojo.schemaOrg.m3n3.meta.Container.SupersededBy
		 */
		public Container.SupersededBy getSupersededBy();
		public void setSupersededBy(Container.SupersededBy supersededBy);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

}
