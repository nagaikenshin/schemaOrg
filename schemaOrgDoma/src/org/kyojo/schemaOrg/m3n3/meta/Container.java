package org.kyojo.schemaOrg.m3n3.meta;

import java.util.List;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgProperty;
import org.kyojo.schemaOrg.SchemaOrgURI;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Enumeration;
import org.kyojo.schemaOrg.m3n3.meta.Clazz;

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
		 * uri: http://schema.org/Class
		 * class: org.kyojo.schemaOrg.m3n3.meta.Clazz.Class
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
		 * uri: http://schema.org/Property
		 * class: org.kyojo.schemaOrg.m3n3.meta.Clazz.Property
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
		 * uri: http://schema.org/Class
		 * class: org.kyojo.schemaOrg.m3n3.meta.Clazz.Class
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
		 * uri: http://schema.org/Property
		 * class: org.kyojo.schemaOrg.m3n3.meta.Clazz.Property
		 */
		public Clazz.Property getProperty();
		public void setProperty(Clazz.Property property);
		public List<Clazz.Property> getPropertyList();
		public void setPropertyList(List<Clazz.Property> propertyList);
		public boolean hasProperty();

		/**
		 * uri: http://schema.org/Enumeration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Enumeration
		 */
		public Enumeration getEnumeration();
		public void setEnumeration(Enumeration enumeration);
		public List<Enumeration> getEnumerationList();
		public void setEnumerationList(List<Enumeration> enumerationList);
		public boolean hasEnumeration();

		/**
		 * uri: http://schema.org/Class
		 * class: org.kyojo.schemaOrg.m3n3.meta.Clazz.Class
		 */
		public Clazz.Class getClazz();
		public void setClazz(Clazz.Class clazz);
		public List<Clazz.Class> getClazzList();
		public void setClazzList(List<Clazz.Class> clazzList);
		public boolean hasClazz();

		public String getNativeValue();

	}

}
