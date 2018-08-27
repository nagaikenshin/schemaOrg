package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.WEAR_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.WearAction;

@ExternalDomain
public class WearActionConverter implements DomainConverter<WearAction, String> {

	@Override
	public String fromDomainToValue(WearAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public WearAction fromValueToDomain(String value) {
		return new WEAR_ACTION(value);
	}

}
