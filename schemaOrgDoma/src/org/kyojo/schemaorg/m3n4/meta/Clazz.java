package org.kyojo.schemaorg.m3n4.meta;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SchemaOrgClass;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n4.core.Clazz.Intangible;
import org.kyojo.schemaorg.m3n4.meta.Container;

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
		 * @see <a href="http://schema.org/supersededBy">http://schema.org/supersededBy</a>
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
		 * @see <a href="http://schema.org/domainIncludes">http://schema.org/domainIncludes</a>
		 */
		public Container.DomainIncludes getDomainIncludes();
		public void setDomainIncludes(Container.DomainIncludes domainIncludes);

		/**
		 * @see <a href="http://schema.org/inverseOf">http://schema.org/inverseOf</a>
		 */
		public Container.InverseOf getInverseOf();
		public void setInverseOf(Container.InverseOf inverseOf);

		/**
		 * @see <a href="http://schema.org/rangeIncludes">http://schema.org/rangeIncludes</a>
		 */
		public Container.RangeIncludes getRangeIncludes();
		public void setRangeIncludes(Container.RangeIncludes rangeIncludes);

		/**
		 * @see <a href="http://schema.org/supersededBy">http://schema.org/supersededBy</a>
		 */
		public Container.SupersededBy getSupersededBy();
		public void setSupersededBy(Container.SupersededBy supersededBy);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

}
