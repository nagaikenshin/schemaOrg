package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GOVERNMENT_PERMIT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GovernmentPermit;

@ExternalDomain
public class GovernmentPermitConverter implements DomainConverter<GovernmentPermit, String> {

	@Override
	public String fromDomainToValue(GovernmentPermit domain) {
		return domain.getNativeValue();
	}

	@Override
	public GovernmentPermit fromValueToDomain(String value) {
		return new GOVERNMENT_PERMIT(value);
	}

}
