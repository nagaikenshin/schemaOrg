package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ORGANIZE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.OrganizeAction;

@ExternalDomain
public class OrganizeActionConverter implements DomainConverter<OrganizeAction, String> {

	@Override
	public String fromDomainToValue(OrganizeAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public OrganizeAction fromValueToDomain(String value) {
		return new ORGANIZE_ACTION(value);
	}

}
