package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.CONTRAINDICATION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Contraindication;

@ExternalDomain
public class ContraindicationConverter implements DomainConverter<Contraindication, String> {

	@Override
	public String fromDomainToValue(Contraindication domain) {
		return domain.getNativeValue();
	}

	@Override
	public Contraindication fromValueToDomain(String value) {
		return new CONTRAINDICATION(value);
	}

}
