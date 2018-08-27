package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.APPLICATION_SUITE;
import org.kyojo.schemaorg.m3n4.core.Container.ApplicationSuite;

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