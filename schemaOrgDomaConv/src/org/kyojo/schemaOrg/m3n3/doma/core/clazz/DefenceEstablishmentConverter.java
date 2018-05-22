package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEFENCE_ESTABLISHMENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DefenceEstablishment;

@ExternalDomain
public class DefenceEstablishmentConverter implements DomainConverter<DefenceEstablishment, String> {

	@Override
	public String fromDomainToValue(DefenceEstablishment domain) {
		return domain.getNativeValue();
	}

	@Override
	public DefenceEstablishment fromValueToDomain(String value) {
		return new DEFENCE_ESTABLISHMENT(value);
	}

}
