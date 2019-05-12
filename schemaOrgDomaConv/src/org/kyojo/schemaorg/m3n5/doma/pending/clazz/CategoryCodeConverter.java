package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.CATEGORY_CODE;
import org.kyojo.schemaorg.m3n5.pending.Clazz.CategoryCode;

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
