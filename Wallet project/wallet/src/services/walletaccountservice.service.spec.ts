import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { WalletAccountService } from './walletaccountservice.service';

describe('WalletAccountService', () => {
  let service: WalletAccountService;
 
  beforeEach(() => {

    beforeEach(() => {
        TestBed.configureTestingModule({});
        service = TestBed.inject(WalletAccountService);
      });
  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
});