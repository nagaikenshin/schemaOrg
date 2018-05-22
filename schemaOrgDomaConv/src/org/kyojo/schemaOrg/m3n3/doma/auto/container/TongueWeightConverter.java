package org.kyojo.schemaOrg.m3n3.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.auto.impl.TONGUE_WEIGHT;
import org.kyojo.schemaOrg.m3n3.auto.Container.TongueWeight;

@ExternalDomain
public class TongueWeightConverter implements DomainConverter<TongueWeight, String> {

	@Override
	public String fromDomainToValue(TongueWeight domain) {
		return domain.getNativeValue();
	}

	@Override
	public TongueWeight fromValueToDomain(String value) {
		return new TONGUE_WEIGHT(value);
	}

}
