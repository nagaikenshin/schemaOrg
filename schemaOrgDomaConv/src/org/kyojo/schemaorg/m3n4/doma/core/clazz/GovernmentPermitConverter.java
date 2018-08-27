package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GOVERNMENT_PERMIT;
import org.kyojo.schemaorg.m3n4.core.Clazz.GovernmentPermit;

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
