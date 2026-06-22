Family 1 — Caesar & Classical Ciphers
1.1  ·  Caesar Decrypt
def solution(k, text):
    out = []
    for c in text:
        if c.isupper(): out.append(chr((ord(c) - 65 - k) % 26 + 65))
        elif c.islower(): out.append(chr((ord(c) - 97 - k) % 26 + 97))
        else: out.append(c)
    return "".join(out)
1.2 ·  Caesar Encrypt
def solution(k, text):
    out = []
    for c in text:
        if c.isupper(): out.append(chr((ord(c) - 65 + k) % 26 + 65))
        elif c.islower(): out.append(chr((ord(c) - 97 + k) % 26 + 97))
        else: out.append(c)
    return "".join(out)

1.3  ·  Caesar Brute Force with Crib
def solution(ct, crib):
    def dec(t, k):
        return "".join(chr((ord(c)-65-k)%26+65) if c.isupper()
                       else chr((ord(c)-97-k)%26+97) if c.islower() else c
                       for c in t)
    crib = crib.lower()
    for k in range(26):
        p = dec(ct, k)
        if crib in p.lower():
            return p
    return ""
  1.5  ·  Recover Caesar Shift
def solution(pt, ct):
    for p, c in zip(pt, ct):
        if p.isalpha() and c.isalpha():
            return (ord(c.upper()) - ord(p.upper())) % 26
    return 0
  1.9  ·  Byte-Range Caesar
def solution(k, hex_data):
    data = bytes.fromhex(hex_data)
    return bytes((b - k) % 256 for b in data).decode()



  Family 2 — One-Time Pad / XOR
2.1  ·  One-Time Pad Decrypt
def solution(hex_ct, hex_key):
    ct = bytes.fromhex(hex_ct)
    key = bytes.fromhex(hex_key)
    return bytes(a ^ b for a, b in zip(ct, key)).decode()
2.2  ·  One-Time Pad Encrypt
def solution(pt, hex_key):
    p = pt.encode()
    key = bytes.fromhex(hex_key)
    return bytes(a ^ b for a, b in zip(p, key)).hex()
2.3  ·  Recover the One-Time Pad
def solution(pt, hex_ct):
    p = pt.encode()
    ct = bytes.fromhex(hex_ct)
    return bytes(a ^ b for a, b in zip(p, ct)).hex()
2.5  ·  Repeating-Key XOR Decrypt
def solution(key, hex_ct):
    k = key.encode()
    ct = bytes.fromhex(hex_ct)
    return bytes(b ^ k[i % len(k)] for i, b in enumerate(ct)).decode()
2.8  ·  Repeating-Key XOR Encrypt
def solution(key, pt):
    k = key.encode()
    p = pt.encode()
    return bytes(b ^ k[i % len(k)] for i, b in enumerate(p)).hex()
2.9  ·  Recover XOR Key from Known Prefix
def solution(hex_ct, prefix):
    ct = bytes.fromhex(hex_ct)
    pref = prefix.encode()
    return bytes(ct[i] ^ pref[i] for i in range(len(pref))).decode()



Family 3 — Hashing (MD5, SHA, HMAC-MD5)
3.1  ·  MD5 and SHA-1 Digests
def solution(msg):
    m = msg.encode()
    return [hashlib.md5(m).hexdigest(), hashlib.sha1(m).hexdigest()]
3.2  ·  SHA-256 Digest
def solution(msg):
    return hashlib.sha256(msg.encode()).hexdigest()
3.3  ·  SHA-512 Digest
def solution(msg):
    return hashlib.sha512(msg.encode()).hexdigest()
3.4  ·  Double SHA-1
def solution(msg):
    return hashlib.sha1(hashlib.sha1(msg.encode()).digest()).hexdigest()
3.5  ·  SHA-256 of Hex-Encoded Bytes
def solution(hex_data):
    return hashlib.sha256(bytes.fromhex(hex_data)).hexdigest()
3.6  ·  HMAC-MD5 (String Key)
def solution(key, msg):
    return hmac.new(key.encode(), msg.encode(), hashlib.md5).hexdigest()
3.7  ·  Identify Hash Algorithm by Length
def solution(digest):
    return {32: "md5", 40: "sha1", 64: "sha256"}[len(digest)]
3.8  ·  Concatenated MD5 and SHA-1
def solution(msg):
    m = msg.encode()
    return hashlib.md5(m).hexdigest() + hashlib.sha1(m).hexdigest()
3.9  ·  Iterated SHA-256 (Key Stretching)
def solution(msg, n):
    x = msg.encode()
    for _ in range(n):
        x = hashlib.sha256(x).digest()
    return x.hex()
3.10  ·  Salted SHA-256
def solution(salt, pw):
    return hashlib.sha256((salt + pw).encode()).hexdigest()


Family 4 — AES (Block Modes)
4.1  ·  AES-CBC Decryption
def solution(key, iv, ciphertext):
    key = bytes.fromhex(key)
    iv  = bytes.fromhex(iv)
    ct  = bytes.fromhex(ciphertext)
    assert len(iv) == 16 and len(ct) % 16 == 0
    out, prev = b"", iv
    for i in range(0, len(ct), 16):
        block = ct[i:i + 16]
        decrypted = aes_decrypt_block(key, block)
        out += bytes(a ^ b for a, b in zip(decrypted, prev))
        prev = block
    return pkcs7_unpad(out).decode()
4.2  ·  AES-CBC Encryption
def solution(key, iv, plaintext):
    key = bytes.fromhex(key)
    iv  = bytes.fromhex(iv)
    pt  = pkcs7_pad(plaintext.encode())
    out, prev = b"", iv
    for i in range(0, len(pt), 16):
        prev = aes_encrypt_block(key, bytes(a ^ b for a, b in zip(pt[i:i + 16], prev)))
        out += prev
    return out.hex()
4.3  ·  AES-ECB Decryption
def solution(key, ciphertext):
    key = bytes.fromhex(key)
    ct  = bytes.fromhex(ciphertext)
    out = b"".join(aes_decrypt_block(key, ct[i:i + 16]) for i in range(0, len(ct), 16))
    return pkcs7_unpad(out).decode()
4.4  ·  AES-ECB Encryption
def solution(key, plaintext):
    key = bytes.fromhex(key)
    pt  = pkcs7_pad(plaintext.encode())
    return b"".join(aes_encrypt_block(key, pt[i:i + 16]) for i in range(0, len(pt), 16)).hex()
4.5  ·  AES-CTR Decryption
def solution(key, nonce, ciphertext):
    key   = bytes.fromhex(key)
    nonce = bytes.fromhex(nonce)
    ct    = bytes.fromhex(ciphertext)
    out = b""
    for i in range(0, len(ct), 16):
        ks = aes_encrypt_block(key, nonce + (i // 16).to_bytes(8, "big"))
        out += bytes(a ^ b for a, b in zip(ct[i:i + 16], ks))
    return out.decode()
4.6  ·  Detect ECB vs CBC
def solution(ciphertext):
    ct = bytes.fromhex(ciphertext)
    blocks = [ct[i:i+16] for i in range(0, len(ct), 16)]
    return "ECB" if len(blocks) != len(set(blocks)) else "CBC"


Family 5 — RSA
5.1  ·  RSA Decryption
def solution(n, d, c):
    return pow(c, d, n)
5.2  ·  RSA Encryption
def solution(n, e, m):
    return pow(m, e, n)
5.3  ·  Derive RSA Private Exponent
def solution(p, q, e):
    return pow(e, -1, (p - 1) * (q - 1))
5.4  ·  RSA Sign
def solution(n, d, m):
    return pow(m, d, n)
5.5  ·  RSA Verify Signature
def solution(n, e, s, m):
    return "VALID" if pow(s, e, n) == m else "INVALID"
5.6  ·  Weak Modulus: Factor and Decrypt
def solution(n, e, c):
    p = 2
    while n % p:
        p += 1
    q = n // p
    d = pow(e, -1, (p - 1) * (q - 1))
    return pow(c, d, n)
5.10  ·  RSA Decrypt to UTF-8
def solution(n, d, c):
    m = pow(c, d, n)
    return m.to_bytes((m.bit_length() + 7) // 8 or 1, "big").decode()



Family 6 — HMAC
6.1  ·  HMAC-SHA1 Verify (Hex Key)
def solution(hex_key, msg, hex_tag):
    key = bytes.fromhex(hex_key)
    tag = bytes.fromhex(hex_tag)
    calc = hmac.new(key, msg.encode(), hashlib.sha1).digest()
    return "VALID" if hmac.compare_digest(calc, tag) else "INVALID"

6.2  ·  HMAC-SHA256 Verify (String Key)
def solution(key, msg, hex_tag):
    tag = bytes.fromhex(hex_tag)
    calc = hmac.new(key.encode(), msg.encode(), hashlib.sha256).digest()
    return "VALID" if hmac.compare_digest(calc, tag) else "INVALID"
6.3  ·  HMAC-SHA1 Generate (Hex Key)
def solution(hex_key, msg):
    key = bytes.fromhex(hex_key)
    return hmac.new(key, msg.encode(), hashlib.sha1).hexdigest()
6.4  ·  HMAC-MD5 Generate (Hex Key)
def solution(hex_key, msg):
    key = bytes.fromhex(hex_key)
    return hmac.new(key, msg.encode(), hashlib.md5).hexdigest()
6.5  ·  HMAC vs Naive H(key||msg)
def solution(key, msg):
    k = key.encode()
    m = msg.encode()
    naive = hashlib.sha256(k + m).hexdigest()
    hmac_tag = hmac.new(k, m, hashlib.sha256).hexdigest()
    return [naive, hmac_tag]
6.8  ·  HMAC-SHA1 Generate (Hex Key)
def solution(hex_key, msg):
    key = bytes.fromhex(hex_key)
    return hmac.new(key, msg.encode(), hashlib.sha1).hexdigest()


Family 7 — Hash Reversing (Brute Force)
7.1  ·  SHA-1 Numeric Brute (Prefix)
def solution(target, prefix):
    for n in range(10_000_000):
        if hashlib.sha1((prefix + str(n)).encode()).hexdigest() == target:
            return n
    return -1
7.2  ·  MD5 'pin' Brute (n < 100000)
def solution(target):
    for n in range(100_000):
        if hashlib.md5(("pin" + str(n)).encode()).hexdigest() == target:
            return n
    return -1
7.3  ·  SHA-1 4-char Lowercase Brute
def solution(target):
    for t in itertools.product(string.ascii_lowercase, repeat=4):
        w = "".join(t)
        if hashlib.sha1(w.encode()).hexdigest() == target:
            return w
    return ""
7.4  ·  MD5 3-char abc123 Brute
def solution(target):
    for t in itertools.product("abc123", repeat=3):
        w = "".join(t)
        if hashlib.md5(w.encode()).hexdigest() == target:
            return w
    return ""
7.5  ·  Salted 4-digit PIN Brute
def solution(target, salt):
    for n in range(10000):
        pin = "%04d" % n
        if hashlib.sha256((salt + pin).encode()).hexdigest() == target:
            return pin
    return ""
7.6  ·  4-digit PIN SHA-256 Brute
def solution(target):
    for n in range(10000):
        pin = "%04d" % n
        if hashlib.sha256(pin.encode()).hexdigest() == target:
            return pin
    return ""
7.7  ·  SHA-1 Dictionary Attack
def solution(target, words):
    for w in words:
        if hashlib.sha1(w.encode()).hexdigest() == target:
            return w
    return ""
  


  


