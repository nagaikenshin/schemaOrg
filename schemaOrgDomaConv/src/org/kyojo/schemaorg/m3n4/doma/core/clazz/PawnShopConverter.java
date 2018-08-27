package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PAWN_SHOP;
import org.kyojo.schemaorg.m3n4.core.Clazz.PawnShop;

@ExternalDomain
public class PawnShopConverter implements DomainConverter<PawnShop, String> {

	@Override
	public String fromDomainToValue(PawnShop domain) {
		return domain.getNativeValue();
	}

	@Override
	public PawnShop fromValueToDomain(String value) {
		return new PAWN_SHOP(value);
	}

}
