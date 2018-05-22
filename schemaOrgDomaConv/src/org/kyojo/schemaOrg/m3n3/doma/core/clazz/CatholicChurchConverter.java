package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CATHOLIC_CHURCH;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CatholicChurch;

@ExternalDomain
public class CatholicChurchConverter implements DomainConverter<CatholicChurch, String> {

	@Override
	public String fromDomainToValue(CatholicChurch domain) {
		return domain.getNativeValue();
	}

	@Override
	public CatholicChurch fromValueToDomain(String value) {
		return new CATHOLIC_CHURCH(value);
	}

}
