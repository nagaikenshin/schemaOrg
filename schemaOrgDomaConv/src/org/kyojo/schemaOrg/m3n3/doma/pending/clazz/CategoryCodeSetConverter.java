package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.CATEGORY_CODE_SET;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.CategoryCodeSet;

@ExternalDomain
public class CategoryCodeSetConverter implements DomainConverter<CategoryCodeSet, String> {

	@Override
	public String fromDomainToValue(CategoryCodeSet domain) {
		return domain.getNativeValue();
	}

	@Override
	public CategoryCodeSet fromValueToDomain(String value) {
		return new CATEGORY_CODE_SET(value);
	}

}
