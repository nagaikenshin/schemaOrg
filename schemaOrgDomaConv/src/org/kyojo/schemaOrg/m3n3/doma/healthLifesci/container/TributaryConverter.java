package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.TRIBUTARY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Tributary;

@ExternalDomain
public class TributaryConverter implements DomainConverter<Tributary, String> {

	@Override
	public String fromDomainToValue(Tributary domain) {
		return domain.getNativeValue();
	}

	@Override
	public Tributary fromValueToDomain(String value) {
		return new TRIBUTARY(value);
	}

}
