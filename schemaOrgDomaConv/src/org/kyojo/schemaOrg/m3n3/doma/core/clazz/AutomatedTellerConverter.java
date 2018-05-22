package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AUTOMATED_TELLER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AutomatedTeller;

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
