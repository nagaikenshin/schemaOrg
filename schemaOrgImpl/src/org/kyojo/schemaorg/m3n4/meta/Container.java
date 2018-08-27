package org.kyojo.schemaorg.m3n4.meta;

import java.util.List;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgProperty;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n4.core.Clazz.Enumeration;
import org.kyojo.schemaorg.m3n4.meta.Clazz;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property")
@CamelizedName("container")
@ConstantizedName("CONTAINER")
public interface Container extends SchemaOrgProperty {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/domainIncludes")
	@SchemaOrgLabel("domainIncludes")
	@SchemaOrgComment(""
			+ "Relates a property to a class that is (one of) the type(s) the property is"
			+ " expected to be used on.")
	@CamelizedName("domainIncludes")
	@ConstantizedName("DOMAIN_INCLUDES")
	public interface DomainIncludes extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Class">http://schema.org/Class</a>
		 */
		public Clazz.Class getClazz();
		public void setClazz(Clazz.Class clazz);
		public List<Clazz.Class> getClazzList();
		public void setClazzList(List<Clazz.Class> clazzList);
		public boolean hasClazz();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/inverseOf")
	@SchemaOrgLabel("inverseOf")
	@SchemaOrgComment(""
			+ "Relates a property to a property that is its inverse. Inverse properties relate"
			+ " the same pairs of items to each other, but in reversed direction. For example,"
			+ " the 'alumni' and 'alumniOf' properties are inverseOf each other. Some"
			+ " properties don't have explicit inverses; in these situations RDFa and JSON-LD"
			+ " syntax for reverse properties can be used.")
	@CamelizedName("inverseOf")
	@ConstantizedName("INVERSE_OF")
	public interface InverseOf extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Property">http://schema.org/Property</a>
		 */
		public Clazz.Property getProperty();
		public void setProperty(Clazz.Property property);
		public List<Clazz.Property> getPropertyList();
		public void setPropertyList(List<Clazz.Property> propertyList);
		public boolean hasProperty();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/rangeIncludes")
	@SchemaOrgLabel("rangeIncludes")
	@SchemaOrgComment(""
			+ "Relates a property to a class that constitutes (one of) the expected type(s) for"
			+ " values of the property.")
	@CamelizedName("rangeIncludes")
	@ConstantizedName("RANGE_INCLUDES")
	public interface RangeIncludes extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Class">http://schema.org/Class</a>
		 */
		public Clazz.Class getClazz();
		public void setClazz(Clazz.Class clazz);
		public List<Clazz.Class> getClazzList();
		public void setClazzList(List<Clazz.Class> clazzList);
		public boolean hasClazz();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/supersededBy")
	@SchemaOrgLabel("supersededBy")
	@SchemaOrgComment(""
			+ "Relates a term (i.e. a property, class or enumeration) to one that supersedes"
			+ " it.")
	@CamelizedName("supersededBy")
	@ConstantizedName("SUPERSEDED_BY")
	public interface SupersededBy extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Class">http://schema.org/Class</a>
		 */
		public Clazz.Class getClazz();
		public void setClazz(Clazz.Class clazz);
		public List<Clazz.Class> getClazzList();
		public void setClazzList(List<Clazz.Class> clazzList);
		public boolean hasClazz();

		/**
		 * @see <a href="http://schema.org/Enumeration">http://schema.org/Enumeration</a>
		 */
		public Enumeration getEnumeration();
		public void setEnumeration(Enumeration enumeration);
		public List<Enumeration> getEnumerationList();
		public void setEnumerationList(List<Enumeration> enumerationList);
		public boolean hasEnumeration();

		/**
		 * @see <a href="http://schema.org/Property">http://schema.org/Property</a>
		 */
		public Clazz.Property getProperty();
		public void setProperty(Clazz.Property property);
		public List<Clazz.Property> getPropertyList();
		public void setPropertyList(List<Clazz.Property> propertyList);
		public boolean hasProperty();

		public String getNativeValue();

	}

}
