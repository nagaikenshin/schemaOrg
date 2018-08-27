package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.AUTO_DEALER;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoDealer;

@ExternalDomain
public class AutoDealerConverter implements DomainConverter<AutoDealer, String> {

	@Override
	public String fromDomainToValue(AutoDealer domain) {
		return domain.getNativeValue();
	}

	@Override
	public AutoDealer fromValueToDomain(String value) {
		return new AUTO_DEALER(value);
	}

}
