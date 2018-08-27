package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DONATE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.DonateAction;

@ExternalDomain
public class DonateActionConverter implements DomainConverter<DonateAction, String> {

	@Override
	public String fromDomainToValue(DonateAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public DonateAction fromValueToDomain(String value) {
		return new DONATE_ACTION(value);
	}

}
