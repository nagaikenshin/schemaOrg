package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.AUTOMATED_TELLER;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutomatedTeller;

@ExternalDomain
public class AutomatedTellerConverter implements DomainConverter<AutomatedTeller, String> {

	@Override
	public String fromDomainToValue(AutomatedTeller domain) {
		return domain.getNativeValue();
	}

	@Override
	public AutomatedTeller fromValueToDomain(String value) {
		return new AUTOMATED_TELLER(value);
	}

}
