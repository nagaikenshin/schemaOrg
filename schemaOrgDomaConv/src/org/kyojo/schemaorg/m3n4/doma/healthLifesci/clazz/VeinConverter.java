package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.VEIN;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Vein;

@ExternalDomain
public class VeinConverter implements DomainConverter<Vein, String> {

	@Override
	public String fromDomainToValue(Vein domain) {
		return domain.getNativeValue();
	}

	@Override
	public Vein fromValueToDomain(String value) {
		return new VEIN(value);
	}

}
