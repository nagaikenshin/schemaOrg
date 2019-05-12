package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ORGANIZE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.OrganizeAction;

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
