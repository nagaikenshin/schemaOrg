package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.CONTRAINDICATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Contraindication;

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
