package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INSTRUMENT;
import org.kyojo.schemaOrg.m3n3.core.Container.Instrument;

@ExternalDomain
public class InstrumentConverter implements DomainConverter<Instrument, String> {

	@Override
	public String fromDomainToValue(Instrument domain) {
		return domain.getNativeValue();
	}

	@Override
	public Instrument fromValueToDomain(String value) {
		return new INSTRUMENT(value);
	}

}
