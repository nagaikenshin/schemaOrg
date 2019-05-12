package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CATHOLIC_CHURCH;
import org.kyojo.schemaorg.m3n5.core.Clazz.CatholicChurch;

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
