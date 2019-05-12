package org.kyojo.schemaorg.m3n5.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.auto.impl.TONGUE_WEIGHT;
import org.kyojo.schemaorg.m3n5.auto.Container.TongueWeight;

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