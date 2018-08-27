package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ELEMENTARY_SCHOOL;
import org.kyojo.schemaorg.m3n4.core.Clazz.ElementarySchool;

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
