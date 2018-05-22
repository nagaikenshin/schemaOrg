package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AWARD;
import org.kyojo.schemaOrg.m3n3.core.Container.Award;

@ExternalDomain
public class AwardConverter implements DomainConverter<Award, String> {

	@Override
	public String fromDomainToValue(Award domain) {
		return domain.getNativeValue();
	}

	@Override
	public Award fromValueToDomain(String value) {
		return new AWARD(value);
	}

}
