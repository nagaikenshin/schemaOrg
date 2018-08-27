package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ELIGIBLE_TRANSACTION_VOLUME;
import org.kyojo.schemaorg.m3n4.core.Container.EligibleTransactionVolume;

@ExternalDomain
public class EligibleTransactionVolumeConverter implements DomainConverter<EligibleTransactionVolume, String> {

	@Override
	public String fromDomainToValue(EligibleTransactionVolume domain) {
		return domain.getNativeValue();
	}

	@Override
	public EligibleTransactionVolume fromValueToDomain(String value) {
		return new ELIGIBLE_TRANSACTION_VOLUME(value);
	}

}
