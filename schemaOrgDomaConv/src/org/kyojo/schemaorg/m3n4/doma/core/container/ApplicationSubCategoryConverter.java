package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.APPLICATION_SUB_CATEGORY;
import org.kyojo.schemaorg.m3n4.core.Container.ApplicationSubCategory;

@ExternalDomain
public class ApplicationSubCategoryConverter implements DomainConverter<ApplicationSubCategory, String> {

	@Override
	public String fromDomainToValue(ApplicationSubCategory domain) {
		return domain.getNativeValue();
	}

	@Override
	public ApplicationSubCategory fromValueToDomain(String value) {
		return new APPLICATION_SUB_CATEGORY(value);
	}

}
