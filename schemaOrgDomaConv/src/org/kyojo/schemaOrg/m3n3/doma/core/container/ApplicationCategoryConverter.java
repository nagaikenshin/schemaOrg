package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.APPLICATION_CATEGORY;
import org.kyojo.schemaOrg.m3n3.core.Container.ApplicationCategory;

@ExternalDomain
public class ApplicationCategoryConverter implements DomainConverter<ApplicationCategory, String> {

	@Override
	public String fromDomainToValue(ApplicationCategory domain) {
		return domain.getNativeValue();
	}

	@Override
	public ApplicationCategory fromValueToDomain(String value) {
		return new APPLICATION_CATEGORY(value);
	}

}
