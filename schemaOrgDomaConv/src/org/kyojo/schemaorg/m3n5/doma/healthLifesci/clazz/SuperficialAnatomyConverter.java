package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SUPERFICIAL_ANATOMY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.SuperficialAnatomy;

@ExternalDomain
public class SuperficialAnatomyConverter implements DomainConverter<SuperficialAnatomy, String> {

	@Override
	public String fromDomainToValue(SuperficialAnatomy domain) {
		return domain.getNativeValue();
	}

	@Override
	public SuperficialAnatomy fromValueToDomain(String value) {
		return new SUPERFICIAL_ANATOMY(value);
	}

}
