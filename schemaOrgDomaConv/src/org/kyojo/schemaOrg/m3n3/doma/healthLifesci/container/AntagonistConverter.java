package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ANTAGONIST;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Antagonist;

@ExternalDomain
public class AntagonistConverter implements DomainConverter<Antagonist, String> {

	@Override
	public String fromDomainToValue(Antagonist domain) {
		return domain.getNativeValue();
	}

	@Override
	public Antagonist fromValueToDomain(String value) {
		return new ANTAGONIST(value);
	}

}
