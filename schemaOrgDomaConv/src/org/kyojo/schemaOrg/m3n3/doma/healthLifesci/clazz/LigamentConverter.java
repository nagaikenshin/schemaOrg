package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.LIGAMENT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.Ligament;

@ExternalDomain
public class LigamentConverter implements DomainConverter<Ligament, String> {

	@Override
	public String fromDomainToValue(Ligament domain) {
		return domain.getNativeValue();
	}

	@Override
	public Ligament fromValueToDomain(String value) {
		return new LIGAMENT(value);
	}

}
