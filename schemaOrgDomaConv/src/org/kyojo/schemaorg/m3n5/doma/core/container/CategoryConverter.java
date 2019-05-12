package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CATEGORY;
import org.kyojo.schemaorg.m3n5.core.Container.Category;

@ExternalDomain
public class CategoryConverter implements DomainConverter<Category, String> {

	@Override
	public String fromDomainToValue(Category domain) {
		return domain.getNativeValue();
	}

	@Override
	public Category fromValueToDomain(String value) {
		return new CATEGORY(value);
	}

}
