package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.APPLICATION_SUITE;
import org.kyojo.schemaOrg.m3n3.core.Container.ApplicationSuite;

@ExternalDomain
public class ApplicationSuiteConverter implements DomainConverter<ApplicationSuite, String> {

	@Override
	public String fromDomainToValue(ApplicationSuite domain) {
		return domain.getNativeValue();
	}

	@Override
	public ApplicationSuite fromValueToDomain(String value) {
		return new APPLICATION_SUITE(value);
	}

}
