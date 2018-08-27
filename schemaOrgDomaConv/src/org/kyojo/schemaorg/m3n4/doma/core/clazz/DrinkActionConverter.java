package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DRINK_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.DrinkAction;

@ExternalDomain
public class DrinkActionConverter implements DomainConverter<DrinkAction, String> {

	@Override
	public String fromDomainToValue(DrinkAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public DrinkAction fromValueToDomain(String value) {
		return new DRINK_ACTION(value);
	}

}
