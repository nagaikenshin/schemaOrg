package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HOW_TO_TIP;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToTip;

@ExternalDomain
public class HowToTipConverter implements DomainConverter<HowToTip, String> {

	@Override
	public String fromDomainToValue(HowToTip domain) {
		return domain.getNativeValue();
	}

	@Override
	public HowToTip fromValueToDomain(String value) {
		return new HOW_TO_TIP(value);
	}

}
