package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ELEMENTARY_SCHOOL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ElementarySchool;

@ExternalDomain
public class ElementarySchoolConverter implements DomainConverter<ElementarySchool, String> {

	@Override
	public String fromDomainToValue(ElementarySchool domain) {
		return domain.getNativeValue();
	}

	@Override
	public ElementarySchool fromValueToDomain(String value) {
		return new ELEMENTARY_SCHOOL(value);
	}

}
