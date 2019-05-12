package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ORGANIZATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.Organization;

@ExternalDomain
public class OrganizationConverter implements DomainConverter<Organization, String> {

	@Override
	public String fromDomainToValue(Organization domain) {
		return domain.getNativeValue();
	}

	@Override
	public Organization fromValueToDomain(String value) {
		return new ORGANIZATION(value);
	}

}
