package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.CATEGORY_CODE;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.CategoryCode;

@ExternalDomain
public class CategoryCodeConverter implements DomainConverter<CategoryCode, String> {

	@Override
	public String fromDomainToValue(CategoryCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public CategoryCode fromValueToDomain(String value) {
		return new CATEGORY_CODE(value);
	}

}
